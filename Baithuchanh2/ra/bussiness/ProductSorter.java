package bussiness;

import entity.Product;

public class ProductSorter {
    public static void quickSort(Product[] products, int left, int right) {
        if (left >= right) return;

        float pivot = products[(left + right) / 2].getProfit();
        int index = partition(products, left, right, pivot);

        quickSort(products, left, index - 1);
        quickSort(products, index, right);
    }

    private static int partition(Product[] products, int left, int right, float pivot) {
        while (left <= right) {
            while (products[left].getProfit() < pivot) left++;
            while (products[right].getProfit() > pivot) right--;

            if (left <= right) {
                swap(products, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(Product[] products, int i, int j) {
        Product temp = products[i];
        products[i] = products[j];
        products[j] = temp;
    }
}
