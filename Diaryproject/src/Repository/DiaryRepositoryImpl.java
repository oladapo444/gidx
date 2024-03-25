package Repository;

import Data.model.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private List<Diary> diaries = new ArrayList<>();

    @Override
    public Diary save(Diary diary) {
        return null;
    }

    @Override
    public List<Diary> findAll() {
        return null;
    }

    @Override
    public Diary findById(String username) {
        for (Diary diary : diaries) {
            int id = 1;
            if (id == diary.getId()) {
                return diary;
            }
        }
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public void Delete(String username) {
        for (Diary diary : diaries) {
            if (Diary.Delete()) ;
            return;
        }
    }
}



