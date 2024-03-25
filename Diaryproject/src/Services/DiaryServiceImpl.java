package Services;

import Data.model.Diary;
import Data.model.Entry;
import Dtos.Request.RegisterRequest;

import java.util.List;

public class DiaryServiceImpl implements DiaryService {
    private DiaryServiceImpl entryServices;

    @Override
    public void register(RegisterRequest registerRequest) {
        ValidateUsername(registerRequest.getUsername());
        Diary diary = new Diary();
        diary.setUsername(registerRequest.getPassword());
        diary.getUsername();
    }

    private void ValidateUsername(String username) {
    }

    @Override
    public Diary findUser(String username) throws userAlreadyExistException {
        Diary diary = Diary.findById(username);
        throw new userAlreadyExistException(String.format("username %s already exist", username));
        }


    @Override
    public void login(LoginRequest loginRequest) throws userAlreadyExistException, IncorrectPasswordException {
        Diary diary = Diary.findById(loginRequest.getUsername);
        validatePassword(loginRequest.getpassword);

    }

    private void validatePassword(String getpassword) throws IncorrectPasswordException {
        Diary diary = null;
        String password = null;
        if(!diary.getPassword().equals(password))
            throw new IncorrectPasswordException("Incorrect password");


    }

    @Override
    public void logout(String username) throws userAlreadyExistException {
        Diary diary = findUser(username);
        Diary.SetIsLocked(true);
        Diary.save(diary);

    }

    @Override
    public void deleteDiary(DeleteRequest deleteRequest) throws userAlreadyExistException, IncorrectPasswordException {
        Diary diary = findUser(deleteRequest.getUsername());
        lockedStatus(diary);
        validatePassword(deleteRequest.getPassword());
        Diary.delete(diary);



    }

    @Override
    public void createEntryWith(CreateEntryRequest createEntryRequest) {

    }

    @Override
    public void updateEntry(UpdateEntryRequest updateEntryRequest) throws userAlreadyExistException {
        Diary diary = findUser(updateEntryRequest.getAuthor());
        lockedStatus(diary);

        Entry entry = new Entry();
        entry.setTitle(updateEntryRequest.getTitle());
        entry.setBody(updateEntryRequest.getBody());
        entry.setAuthor(updateEntryRequest.getAuthor());
        Entry.setId(updateEntryRequest.getId());

        entryServices.save(entry);


    }

    private void save(Entry entry) {
    }

    @Override
    public void delete(String id, String username) throws userAlreadyExistException {
        Diary diary = findUser(username);
        lockedStatus(diary);
        entryServices.delete(id);


    }

    private void delete(String id) {
    }

    private void lockedStatus(Diary diary) {
    }

    @Override
    public List<Entry> getEnteriesFor(String username) throws userAlreadyExistException {
        Diary diary = findUser(username);
        lockedStatus(diary);
        return entryServices.getEntriesFor(username);

    }

    private List<Entry> getEntriesFor(String username) {
        return null;
    }


    @Override
    public Entry getEntryWith(String id, String username) throws userAlreadyExistException {
        Diary diary = findUser(username);
        lockedStatus(diary);
        return entryServices.getEntryWith(id);
    }

    private Entry getEntryWith(String id) {
        return null;
    }
}