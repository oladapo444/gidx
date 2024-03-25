package Services;

import Data.model.Diary;
import Data.model.Entry;
import Dtos.Request.RegisterRequest;

import java.util.List;

public interface DiaryService {
    void register(RegisterRequest registerRequest);
    Diary findUser(String username) throws userAlreadyExistException;

    void login(LoginRequest loginRequest) throws userAlreadyExistException, IncorrectPasswordException;

    void logout(String username) throws userAlreadyExistException;

    void deleteDiary(DeleteRequest deleteRequest) throws userAlreadyExistException, IncorrectPasswordException;

    void createEntryWith(CreateEntryRequest createEntryRequest);

     void updateEntry(UpdateEntryRequest updateEntryRequest) throws userAlreadyExistException;

     void delete(String id, String username) throws userAlreadyExistException;

     List<Entry> getEnteriesFor(String username) throws userAlreadyExistException;

     Entry getEntryWith(String id, String username) throws userAlreadyExistException;
}