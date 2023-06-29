import java.sql.*;

public class DAOsecondoPiatto {
    private static final String URL_DB  = "URL_DATABASE_LOCALE";
    private static final String ID_USER = "root";
    private static final String PASSWORD = "PASSWORD";

    public void createTable() {

        Connection connection = null;

        try{
        connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);

        //vedere questa riga
        Statement statement = connection.createStatement();

            String createQuery = ""
                    + "create table if not exists secondi_piatti( "
                    + "id_secondopiatto int , "
                    + "nome varchar(255), "
                    + "descrizione varchar(255), "
                    + "prezzo double, "
                    + "alSangue boolean, "
                    + "primary key (id_secondopiatto) "
                    + ")";

        statement.executeUpdate(createQuery);
        statement.close();
        connection.close();

        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("LA TABELLA SECONDI PIATTI E' STATA CREATA ");
    }

    //CREATE -> INSERT
    public void insertSecondoPiatto(SecondoPiatto secondoPiatto){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            Statement statement = connection.createStatement();


            String insertQuery  = "INSERT INTO SECONDI_PIATTI (id_secondopiatto,nome, descrizione, prezzo, alSangue) VALUES " +
                    "('"+
                    secondoPiatto.getId_secondoPiatto() + "', '" +
                    secondoPiatto.getNome() + "', '" +
                    secondoPiatto.getDescrizione() + "', " +
                    secondoPiatto.getPrezzo() + ", " +
                    secondoPiatto.isAlSangue() + ")";

            statement.executeUpdate(insertQuery);
            statement.close();
            connection.close();


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("INSERIMENTO SECONDI PIATTI AVVENUTO CON SUCCESSO!");
    }

    //READ -> SELECT

    //I dati recuperati bisogna salvarli o soltato visualizzarli ???
    public void readSecondiPiatti(){
        Statement statement = null;
        ResultSet resultSets = null;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            statement = connection.createStatement();
            resultSets = statement.executeQuery("SELECT * FROM SECONDI_PIATTI");

            ResultSetMetaData metaData = resultSets.getMetaData();
            int columnCount = metaData.getColumnCount();

            //STAMPA DEI NOMI DELLE COLONNE
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            //STAMPA DEI DATI DELLE RIGHE
            while (resultSets.next()) {
                for (int i = 1; i <= columnCount; i++) {
                     System.out.print(resultSets.getString(i) + "\t");
                }
                System.out.println();

            }
            }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("LETTURA SECONDI PIATTI AVVENUTO CON SUCCESSO!");
    }

    //UPDATE -> UPDATE

    //il metodo deve modificare tutti i piatti con lo stesso nome???
    public void updateTable(SecondoPiatto secondoPiatto, int ID){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
            Statement statement = connection.createStatement();

            //utilizzare l'id nella condizione di modifica????

            String updateQuery2= "UPDATE secondipiatti"+
                    " SET nome='"+secondoPiatto.getNome()+"',"+
                    " descrizione= "+secondoPiatto.getDescrizione()+", prezzo='"+secondoPiatto.getPrezzo() +
                    "', alSangue='"+ secondoPiatto.isAlSangue()+
                    " WHERE ID="+ID+";";
            String updateQuery =  "UPDATE secondi_piatti SET " +
                    "nome = '" + secondoPiatto.getNome() +
                    "', descrizione = '" +secondoPiatto.getDescrizione() +
                    "', prezzo = " + secondoPiatto.getPrezzo()+
                    ", alSangue = " + secondoPiatto.isAlSangue() +
                    " WHERE id_secondopiatto = " + ID;

            statement.executeUpdate(updateQuery);
            statement.close();
            connection.close();


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("MODIFICA SECONDI PIATTI AVVENUTA CON SUCCESSO!");
    }

    //DELETE -> DELETE
        public void deleteSecondoPiatto(String nomePiatto){

            Connection connection = null;

            try{
                connection = DriverManager.getConnection(URL_DB,ID_USER,PASSWORD);
                Statement statement = connection.createStatement();

                String deleteQuery = "DELETE FROM SECONDI_PIATTI WHERE nome= " + "'" + nomePiatto + "';";


                statement.executeUpdate(deleteQuery);
                statement.close();
                connection.close();


            }catch (SQLException ex){
                throw new RuntimeException(ex);
            }
            System.out.println("ELIMINAZIONE SECONDO PIATTO AVVENUTA CON SUCCESSO!");
        }


}
