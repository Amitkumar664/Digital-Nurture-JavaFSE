package EcommerceSearch.code;
public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(104, "Mouse", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Chair", "Furniture"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Table", "Furniture")
        };

        Product result = SearchOperations.linearSearch(products, 102);

        if (result != null) {
            System.out.println("Linear Search:");
            System.out.println(result.productId + " " + result.productName + " " + result.category);
        }

        Product[] sortedProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Table", "Furniture"),
                new Product(104, "Mouse", "Electronics"),
                new Product(105, "Chair", "Furniture")
        };

        Product ans = SearchOperations.binarySearch(sortedProducts, 102);

        if (ans != null) {
            System.out.println("\nBinary Search:");
            System.out.println(ans.productId + " " + ans.productName + " " + ans.category);
        }
    }
}