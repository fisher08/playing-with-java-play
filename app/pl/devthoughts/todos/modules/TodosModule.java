package pl.devthoughts.todos.modules;

import com.google.inject.AbstractModule;
import pl.devthoughts.todos.repository.TodoItemRepository;
import pl.devthoughts.todos.repository.ebean.TodoItemEbeanRepository;

public class TodosModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TodoItemRepository.class)
            .to(TodoItemEbeanRepository.class);
    }
}
