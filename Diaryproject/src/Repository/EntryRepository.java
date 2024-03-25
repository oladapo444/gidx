package Repository;

import Data.model.Entry;

import java.util.List;

public interface EntryRepository {
  Entry save(Entry entry);
  List<Entry>findAll();
  List<Entry> findEntryByName(String username);
  Entry findById(int id);
  void delete(int id);
  void  delete(Entry entry);
  Long count();
}
