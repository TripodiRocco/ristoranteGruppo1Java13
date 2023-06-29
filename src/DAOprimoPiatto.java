import java.sql.*;

public class DAOprimoPiatto {
    private static final String URL_DB = "jdbc:mysql://127.0.0.1:3306/db_ristorante";
    private static final String ID_USER = "root";
    private static final String PASSWORD = "password";

    public void createTable() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB, ID_USER, PASSWORD);

            Statement statement = connection.createStatement();

            String createQuery = ""
                    + "create table if not exists primi_piatti( "
                    + "id_primopiatto int , "
                    + "nome varchar(255), "
                    + "descrizione varchar(255), "
                    + "prezzo double, "
                    + "al_dente boolean, "
                    + "primary key (id_primopiatto) "
                    + ")";

            statement.executeUpdate(createQuery);
            statement.close();
            connection.close();
            System.out.println("LA TABELLA PRIMI PIATTI E' STATA CREATA ");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void insertPrimoPiatto(PrimoPiatto primoPiatto) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB, ID_USER, PASSWORD);
            Statement statement = connection.createStatement();

            String insertQuery  = "INSERT INTO PRIMI_PIATTI (id_primopiatto,nome, descrizione, prezzo, al_Dente) VALUES " +
                    "('"+
                    primoPiatto.getId_primopiatto() + "', '" +
                    primoPiatto.getNome() + "', '" +
                    primoPiatto.getDescrizione() + "', " +
                    primoPiatto.getPrezzo() + ", " +
                    primoPiatto.getIsAlDente() + ")";

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

            String updateQuery =  "UPDATE PRIMI_PIATTI SET " +
                    "nome = '" + primoPiatto.getNome() +
                    "', descrizione = '" +primoPiatto.getDescrizione() +
                    "', prezzo = " + primoPiatto.getPrezzo()+
                    ", al_Dente = " + primoPiatto.getIsAlDente() +
                    " WHERE id_primopiatto = " + ID;

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