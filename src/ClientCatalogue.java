import java.util.ArrayList;

public class ClientCatalogue {

    private ArrayList<Client> clients;

    public ClientCatalogue(InnerController controller) {
        this.clients = new ArrayList<>();
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client){
        this.clients.add(client);
    }


}