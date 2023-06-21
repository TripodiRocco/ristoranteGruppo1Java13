import java.sql.*;

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
                    "CREATE TABLE IF NOT EXISTS BEVANDE " +
                            "( ID INT AUTO_INCREMENT, " +
                            "nome VARCHAR (255)" +
                            "descrizione VARCHAR (255) " +
                            "prezzo DOUBLE" +
                            "capacityInCl DOUBLE" +
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


    public void insertBevanda(Bevanda bevanda){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            Statement statement = connection.createStatement();

            String insertQuery = "INSERT INTO BEVANDE" +
                    "(nome, descrizione, prezzo, capacityInCl) VALUES (' " +
                    bevanda.getNome() + " ', ' " +
                    bevanda.getDescrizione() + " ',' " +
                    bevanda.getPrezzo() + " ',' " +
                    bevanda.getCapacityInCl() + " '); ";

            statement.executeUpdate(insertQuery);
            statement.close();
            connection.close();


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("INSERIMENTO BEVANDE AVVENUTO CON SUCCESSO!");
    }


    public void readBevande(){
        Statement statement = null;
        ResultSet resultSets = null;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            statement = connection.createStatement();
            resultSets = statement.executeQuery("SELECT * FROM BEVANDE");

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
        System.out.println("LETTURA BEVANDE AVVENUTO CON SUCCESSO!");
    }




    public void updateTable(Bevanda bevanda, int ID){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            Statement statement = connection.createStatement();


            String updateQuery= "UPDATE bevande"+
                    " SET nome='"+bevanda.getNome()+"',"+
                    " descrizione= "+bevanda.getDescrizione()+", prezzo='"+bevanda.getPrezzo() +
                    "', capacityInCl='"+ bevanda.getCapacityInCl()+
                    " WHERE ID="+ID+";";

            statement.executeUpdate(updateQuery);
            statement.close();
            connection.close();


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("MODIFICA BEVANDE AVVENUTA CON SUCCESSO!");
    }


    public void deleteBevande(String bevanda){

        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            Statement statement = connection.createStatement();

            String deleteQuery = "DELETE FROM BEVANDE WHERE nome= " + "'" + bevanda + "';";


            statement.executeUpdate(deleteQuery);
            statement.close();
            connection.close();


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("ELIMINAZIONE BEVANDA AVVENUTA CON SUCCESSO!");
    }

}
