package pl.devthoughts.todos.repository;

import javaslang.control.Option;
import pl.devthoughts.todos.controllers.TodoItemRequest;
import pl.devthoughts.todos.domain.TodoItem;
import pl.devthoughts.todos.domain.TodoItemId;
import pl.devthoughts.todos.domain.TodoItems;

public interface TodoItemRepository {
    TodoItemId saveItem(TodoItem item);

    Option<TodoItem> findItem(String id);

    void updateItem(TodoItem item, TodoItemRequest req);

    void removeItem(TodoItem item);

    TodoItems findAllItems();

    void finishItem(TodoItem it);

    void reopenItem(TodoItem it);
}
