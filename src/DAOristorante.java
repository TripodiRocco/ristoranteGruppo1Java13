import java.sql.*;

public class DAOristorante {
    private static final String URL_DB = "127.0.0.1";
    private static final String ID_USER = "root";
    private static final String PASSWORD = "password";

    public void createTable() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB, ID_USER, PASSWORD);


            Statement statement = connection.createStatement();

            String createQuery = ""
                    + "CREATE TABLE RISTORANTE( "
                    + "  ID_RISTORANTE INT, "
                    + "  NOME_RISTORANTE VARCHAR(255), "
                    + "  NOME_CHEF VARCHAR (255), "
                    + "  CAPIENZA INT, "
                    + "  ID_PRENOTAZIONE INT, "
                    + "  PRIMARY KEY(ID_RISTORANTE), "
                    + "  FOREIGN KEY(ID_PRENOTAZIONE) REFERENCES PRENOTAZIONE(ID_PRENOTAZIONE) "
                    + ");";

            statement.executeUpdate(createQuery);
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("LA TABELLA RISTORANTE E' STATA CREATA ");
    }

    public void insertRistorante(Ristorante ristorante){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            Statement statement = connection.createStatement();

            String insertQuery = ""
                    + "INSERT INTO RISTORNATE(ID_RISTORANTE,NOME_RISTORANTE,NOME_CHEF,CAPIENZA,ID_PRENOTAZIONE,ID_MENU) "
                    + "VALUES(1,'DEVELHOPE','CHEF_DEVELOP',30,123,456)";

            statement.executeUpdate(insertQuery);
            statement.close();
            connection.close();


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("INSERIMENTO RISTORANTE AVVENUTO CON SUCCESSO!");
    }


    public void readRistorante(){
        Statement statement = null;
        ResultSet resultSets = null;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            statement = connection.createStatement();
            resultSets = statement.executeQuery("SELECT * FROM RISTORANTE");

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
        System.out.println("LETTURA RISTORANTE AVVENUTO CON SUCCESSO!");
    }




    public void updateTable(Ristorante ristorante, int ID_RISTORANTE){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            Statement statement = connection.createStatement();


            String updateQuery= "UPDATE ristorante"+
                    " SET nome='"+ristorante.getNomeRistorante()+"',"+
                    " nome chef = "+ristorante.getNomeChef() + "',"+
                    " WHERE ID="+ID_RISTORANTE+";";

            statement.executeUpdate(updateQuery);
            statement.close();
            connection.close();


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("MODIFICA RISTORANTE AVVENUTA CON SUCCESSO!");
    }


    public void deleteRistorante(String ristorante){

        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            Statement statement = connection.createStatement();

            String deleteQuery = "DELETE FROM RISTORANTE WHERE nome= " + "'" + ristorante + "';";


            statement.executeUpdate(deleteQuery);
            statement.close();
            connection.close();


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("ELIMINAZIONE RISTORANTE AVVENUTA CON SUCCESSO!");
    }
}
