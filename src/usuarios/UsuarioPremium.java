package usuarios;
import java.util.Date;
public class UsuarioPremium extends Usuario {
    private boolean Premium;

    public boolean isPremium() {
        return Premium;
    }

    public void setPremium(boolean premium) {
        Premium = premium;
    }
}