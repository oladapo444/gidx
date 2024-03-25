package Repository;

import Data.model.Diary;

import java.util.List;

public interface DiaryRepository {
     Diary save(Diary diary);
     List<Diary>findAll();

     Diary findById(String username);

     Long count();

     void Delete(String username);

     void Delete(Diary diary);

    void addDiary(Diary diary);

     void delete(Diary diary);
}