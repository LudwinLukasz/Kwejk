//package pl.akademiakodu.kwejk.projekt.repository;
//
//import org.springframework.stereotype.Component;
//import pl.akademiakodu.kwejk.projekt.model.Category;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by arabk on 04.11.2017.
// */
//public class CategoryRepo {
//
//    public List<Category> categories = new ArrayList<>();
//
//    public void addCategory(Category category) {
//        categories.add(category);
//    }
//
//    public Category findByName(String name) {
//        for (Category category : categories
//                ) {
//            if (category.getName().equals(name)) {
//                return category;
//            }
//        }
//        throw new IllegalArgumentException("category "+ name + " does not exist") ;
//    }
//
//    public Category findById(Long id) {
//        for (Category category : categories
//                ) {
//            if (category.getId().equals(id)) {
//                return category;
//            }
//        }
//        throw new IllegalArgumentException("category "+ id + " does not exist") ;
//    }
//
//
//}
////    public void addGifToCategory(Category category, Gif gif) {
////
////    }
//
//
