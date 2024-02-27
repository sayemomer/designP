package CreationalP.Builder.Product;

public class ProductBuilder {
    // Required parameters
    private final String name;
    private final int id;
    
    // Optional parameters
    private final int weight;
    private final String description;
    
    // Private constructor
    private ProductBuilder(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.weight = builder.weight;
        this.description = builder.description;
    }
    
    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private final String name;
        private final int id;
        
        // Optional parameters initialized to default values
        private int weight = 0;
        private String description = "";
        
        // Constructor with required parameters
        public Builder(String name, int id) {
            this.name = name;
            this.id = id;
        }
        
        // Methods to set optional parameters
        public Builder weight(int value) {
            weight = value;
            return this; // By returning the builder each time, we can chain method calls.
        }
        
        public Builder description(String value) {
            description = value;
            return this;
        }
        
        // Build method to create an instance of Product
        public ProductBuilder build() {
            return new ProductBuilder(this);
        }
    }
    
    // Product class methods...
}
