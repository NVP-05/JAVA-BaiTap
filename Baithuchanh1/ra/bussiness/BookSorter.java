package bussiness;

import entity.Book;

import java.util.List;

public class BookSorter{
    public static void quickSortByExportPrice(List<Book> books, int left, int right) {
        if (left < right) {
            int pivotIndex = partitionByExportPrice(books, left, right);
            quickSortByExportPrice(books, left, pivotIndex - 1);
            quickSortByExportPrice(books, pivotIndex + 1, right);
        }
    }

    private static int partitionByExportPrice(List<Book> books, int left, int right) {
        float pivot = books.get(right).getExportPrice();
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (books.get(j).getExportPrice() < pivot) {
                i++;
                swap(books, i, j);
            }
        }
        swap(books, i + 1, right);
        return i + 1;
    }

    private static void swap(List<Book> books, int i, int j) {
        Book temp = books.get(i);
        books.set(i, books.get(j));
        books.set(j, temp);
    }

    public static void quickSortByInterestDesc(List<Book> books, int left, int right) {
        if (left < right) {
            int pivotIndex = partitionByInterestDesc(books, left, right);
            quickSortByInterestDesc(books, left, pivotIndex - 1);
            quickSortByInterestDesc(books, pivotIndex + 1, right);
        }
    }

    private static int partitionByInterestDesc(List<Book> books, int left, int right) {
        float pivot = books.get(right).getInterest();
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (books.get(j).getInterest() > pivot) {
                i++;
                swap(books, i, j);
            }
        }
        swap(books, i + 1, right);
        return i + 1;
    }
}
