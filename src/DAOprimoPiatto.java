import java.sql.*;

public class DAOprimoPiatto {
    private static final String URL_DB = "URL_DATABASE_LOCALE";
    private static final String ID_USER = "root";
    private static final String PASSWORD = "PASSWORD";

    public void createTable() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB, ID_USER, PASSWORD);

            Statement statement = connection.createStatement();

            String createQuery =
                    "CREATE TABLE IF NOT EXISTS PRIMI_PIATTI " +
                            "( ID INT AUTO_INCREMENT, " +
                            "nome VARCHAR (255)" +
                            "descrizione VARCHAR (255) " +
                            "prezzo DOUBLE" +
                            "alDente BOOLEAN" +
                            "PRIMARY KEY (ID)" +
                            " );";

            statement.executeUpdate(createQuery);
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("LA TABELLA PRIMI PIATTI E' STATA CREATA ");
    }

    public void insertPrimoPiatto(PrimoPiatto primoPiatto) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB, ID_USER, PASSWORD);
            Statement statement = connection.createStatement();

            String insertQuery = "INSERT INTO SECONDI_PIATTI" +
                    "(nome, descrizione, prezzo, alSangue) VALUES (' " +
                    primoPiatto.getNome() + " ', ' " +
                    primoPiatto.getDescrizione() + " ',' " +
                    primoPiatto.getPrezzo() + " ',' " +
                    primoPiatto.getIsAlDente() + " '); ";

            statement.executeUpdate(insertQuery);
            statement.close();
            connection.close();


        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("INSERIMENTO PRIMI PIATTI AVVENUTO CON SUCCESSO!");
    }

    public void readPrimiPiatti() {
        Statement statement = null;
        ResultSet resultSets = null;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB, ID_USER, PASSWORD);
            statement = connection.createStatement();
            resultSets = statement.executeQuery("SELECT * FROM PRIMI_PIATTI");

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
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("LETTURA PRIMI PIATTI AVVENUTO CON SUCCESSO!");
    }

   public void updateTable(PrimoPiatto primoPiatto, int ID) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB, ID_USER, PASSWORD);
            Statement statement = connection.createStatement();

            String updateQuery = "UPDATE primipiatti" +
                    " SET nome='" + primoPiatto.getNome() + "'," +
                    " descrizione= " + primoPiatto.getDescrizione() + ", prezzo='" + primoPiatto.getPrezzo() +
                    "', alSangue='" + primoPiatto.getIsAlDente() +
                    " WHERE ID=" + ID + ";";

            statement.executeUpdate(updateQuery);
            statement.close();
            connection.close();


        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("MODIFICA PRIMI PIATTI AVVENUTA CON SUCCESSO!");
    }

    public void deletePrimoPiatto(String nomePiatto) {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB, ID_USER, PASSWORD);
            Statement statement = connection.createStatement();

            String deleteQuery = "DELETE FROM PRIMI_PIATTI WHERE nome= " + "'" + nomePiatto + "';";


            statement.executeUpdate(deleteQuery);
            statement.close();
            connection.close();


        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("ELIMINAZIONE PRIMO PIATTO AVVENUTA CON SUCCESSO!");
    }
}