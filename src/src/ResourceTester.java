package src;

import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JOptionPane;

public class ResourceTester {

    private final File dummy;
    private final File file;
    private String sql;

    public ResourceTester() {

        this.dummy = new File("");
        this.file = new File(dummy.getAbsolutePath() + "/EMMS-RES");
    }

    public void createDirectory() {

        try {

            if (!this.file.exists()) {

                this.file.mkdirs();

                this.sql = "CREATE  TABLE IF NOT EXISTS member_info("
                        + "id VARCHAR PRIMARY KEY  NOT NULL , "
                        + "name VARCHAR NOT NULL )";

                ConnectToDatabase.getResult(this.sql);

                this.sql = "CREATE  TABLE  IF NOT EXISTS payment_info("
                        + "id VARCHAR NOT NULL , "
                        + "date VARCHAR NOT NULL , "
                        + "amount VARCHAR NOT NULL )";

                ConnectToDatabase.getResult(this.sql);

                this.sql = "CREATE  TABLE  IF NOT EXISTS meal_info("
                        + "id VARCHAR NOT NULL , "
                        + "date VARCHAR NOT NULL , "
                        + "meal VARCHAR)";

                ConnectToDatabase.getResult(this.sql);

                this.sql = "CREATE  TABLE  IF NOT EXISTS shopping_cost("
                        + "date VARCHAR NOT NULL , "
                        + "cost VARCHAR NOT NULL )";

                ConnectToDatabase.getResult(this.sql);
            }
        } catch (HeadlessException e) {

            JOptionPane.showMessageDialog(null, "System Erron!\n"
                    + "Please drop a mail to ashik.ar.420@gmail.com");
        }
    }
}
