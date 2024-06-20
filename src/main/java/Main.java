import entities.Product;
import managers.CartsManager;
import managers.ClientsManager;
import managers.ProductsManager;

public class Main {
    public static void main(String[] args){
        ProductsManager product = new ProductsManager();
        product.create("zapatillas azules", 100, 50.25);
        product.create("zapatillas rojas", 105, 54.75);
        product.create("zapatillas negras", 98, 60);
        product.create("remeras azules", 500, 49.25);
        product.create("remeras rojas", 600, 58);
        product.create("remeras negras", 687, 52.5);
        System.out.println(product.readOne(1));
        ClientsManager client = new ClientsManager();
        client.create("marcos",38251);
        client.create("aldana",40500);
        System.out.println(client.readOne(1));
        CartsManager cart = new CartsManager();
        cart.addtoCart(1,product.readOne(1),client.readOne(1));
        cart.addtoCart(1,product.readOne(6),client.readOne(1));
        cart.addtoCart(1,product.readOne(6),client.readOne(2));
        System.out.println(cart.readByClient(client.readOne(1)));
        System.out.println(cart.readByClient(client.readOne(2)));

    }
}
