package ss12_Java_colletion.model;

import java.util.Objects;

public class Product {
        private String id;
        private String name;
        private String manufacturer;
        private double price;

        public Product(String id, String name, String manufacturer, double price) {
                this.id = id;
                this.name = name;
                this.manufacturer = manufacturer;
                this.price = price;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getManufacturer() {
                return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        @Override
        public String toString() {
                return "Product{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", manufacturer='" + manufacturer + '\'' +
                        ", price=" + price +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Product product = (Product) o;
                return id.equals(product.id);
        }
}
