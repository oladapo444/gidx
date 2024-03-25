package Repository;

import Data.model.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryimpl implements EntryRepository {
    private static List<Entry> entries = new ArrayList<>();
    private int numberOfLastId;

    @Override
    public Entry save(Entry entry) {
        if (isNew(entry)) addIdTo(entry);
        else update(entry);

        entries.add(entry);

        return entry;
    }

    private void update(Entry entry) {
        Entry oldEntry = findById(Entry.getId());
        entry.setDateCreated(oldEntry.getDateCreated());
        entries.remove(oldEntry);
    }

    private void addIdTo(Entry entry) {
        entry.setId(generateId());
    }

    private int generateId() {
        return ++ numberOfLastId;
    }

    private boolean isNew(Entry entry) {
        return Entry.getId() == 0;
    }

    @Override
    public List<Entry> findAll() {
        return null;
    }

    @Override
    public List<Entry> findEntryByName(String username) {
        List<Entry>foundEntries = new ArrayList<>();
        for (Entry entry : entries) if (entry.getAuthor().equalsIgnoreCase(username))
      foundEntries.add(entry);
        return foundEntries;
    }

    @Override
    public Entry findById(int id) {
        for (Entry entry: entries){
            if (Entry.getId()==(id)) return entry;

        }
        return null;

    }

    @Override
    public void delete(int id) {
        Entry entry = findById(id);
            entries.remove(entry);

    }

    @Override
    public void delete(Entry entry) {
        entries.remove(entry);

    }

    @Override
    public Long count() {
        return (long) entries.size();
    }
}



