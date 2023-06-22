import java.sql.*;

public class DAOdessert {
    public class DAObevanda {
        private static final String URL_DB  = "URL_DATABASE_LOCALE";
        private static final String ID_USER = "root";
        private static final String PASSWORD = "PASSWORD";

        public void createTable() {

            Connection connection = null;

            try{
                connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);


                Statement statement = connection.createStatement();

                String createQuery =
                        "CREATE TABLE IF NOT EXISTS DESSERT " +
                                "( ID INT AUTO_INCREMENT, " +
                                "nome VARCHAR (255)" +
                                "descrizione VARCHAR (255) " +
                                "prezzo DOUBLE" +
                                "lattosio BOOLEAN" +
                                "PRIMARY KEY (ID)" +
                                " );";

                statement.executeUpdate(createQuery);
                statement.close();
                connection.close();

            }catch (SQLException ex){
                throw new RuntimeException(ex);
            }
            System.out.println("LA TABELLA BEVANDE E' STATA CREATA ");
        }


        public void insertDessert(Dessert dessert){
            Connection connection = null;

            try{
                connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
                Statement statement = connection.createStatement();

                String insertQuery = "INSERT INTO BEVANDE" +
                        "(nome, descrizione, prezzo, lattosio) VALUES (' " +
                        dessert.getNome() + " ', ' " +
                        dessert.getDescrizione() + " ',' " +
                        dessert.getPrezzo() + " ',' " +
                        dessert.isLattosio() + " '); ";

                statement.executeUpdate(insertQuery);
                statement.close();
                connection.close();


            }catch (SQLException ex){
                throw new RuntimeException(ex);
            }
            System.out.println("INSERIMENTO DESSERT AVVENUTO CON SUCCESSO!");
        }


        public void readDessert(){
            Statement statement = null;
            ResultSet resultSets = null;
            Connection connection = null;

            try {
                connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
                statement = connection.createStatement();
                resultSets = statement.executeQuery("SELECT * FROM DESSERT");

                ResultSetMetaData metaData = resultSets.getMetaData();
                int columnCount = metaData.getColumnCount();


                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + "\t");
                }
                System.out.println();


                while (resultSets.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(resultSets.getString(i) + "\t");
                    }
                    System.out.println();

                }
            }catch(SQLException ex){
                throw new RuntimeException(ex);
            }
            System.out.println("LETTURA DESSERT AVVENUTA CON SUCCESSO!");
        }




        public void updateTable(Dessert dessert, int ID){
            Connection connection = null;

            try{
                connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
                Statement statement = connection.createStatement();


                String updateQuery= "UPDATE bevande"+
                        " SET nome='"+dessert.getNome()+"',"+
                        " descrizione= "+dessert.getDescrizione()+", prezzo='"+dessert.getPrezzo() +
                        "', capacityInCl='"+ dessert.isLattosio()+
                        " WHERE ID="+ID+";";

                statement.executeUpdate(updateQuery);
                statement.close();
                connection.close();


            }catch (SQLException ex){
                throw new RuntimeException(ex);
            }
            System.out.println("MODIFICA BEVANDE AVVENUTA CON SUCCESSO!");
        }


        public void deleteDessert(String dessert){

            Connection connection = null;

            try{
                connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
                Statement statement = connection.createStatement();

                String deleteQuery = "DELETE FROM DESSERT WHERE nome= " + "'" + dessert + "';";


                statement.executeUpdate(deleteQuery);
                statement.close();
                connection.close();


            }catch (SQLException ex){
                throw new RuntimeException(ex);
            }
            System.out.println("ELIMINAZIONE DESSERT AVVENUTA CON SUCCESSO!");
        }

    }

}
