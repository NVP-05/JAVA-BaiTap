package bussiness;

import entity.Customer;
import entity.LimitSort;

import java.util.List;

public class CustomerSorter{
    public static void quickSort(List<Customer> arr, LimitSort limitSort, String criteria) {
        if (limitSort.getLow() < limitSort.getHigh()) {
            int pi = partition(arr, new LimitSort(limitSort.getLow(), limitSort.getHigh()), criteria);
            quickSort(arr, new LimitSort(limitSort.getLow(), pi - 1), criteria);
            quickSort(arr, new LimitSort(pi + 1, limitSort.getHigh()), criteria);
        }
    }

    private static int partition(List<Customer> arr, LimitSort limitSort, String criteria) {
        Customer pivot = arr.get(limitSort.getHigh());
        int i = limitSort.getLow() - 1;

        for (int j = limitSort.getLow(); j < limitSort.getHigh(); j++) {
            boolean condition;
            if ("name".equals(criteria)) {
                condition = arr.get(j).getFirstName().compareToIgnoreCase(pivot.getFirstName()) < 0;
            } else {
                condition = extractYear(arr.get(j).getDateOfBirth()) < extractYear(pivot.getDateOfBirth());
            }

            if (condition) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, limitSort.getHigh());
        return i + 1;
    }

    private static void swap(List<Customer> arr, int i, int j) {
        Customer temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    private static int extractYear(String dob) {
        return Integer.parseInt(dob.split("/")[2]);
    }

}
