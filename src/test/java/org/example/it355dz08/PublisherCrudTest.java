package org.example.it355dz08;
import org.example.it355dz08.entity.PublisherEntity;
import org.example.it355dz08.repository.PublisherRepository;
import org.junit.jupiter.api.Test;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
@DataJpaTest
@Transactional
public class PublisherCrudTest {
    @Autowired
    private PublisherRepository publisherRepository;

    @Test
    public void testGetAllPublishers() {

        PublisherEntity publisher1 = new PublisherEntity();
        publisher1.setPublisher("Publisher naziv 1");

        PublisherEntity publisher2 = new PublisherEntity();
        publisher2.setPublisher("Publisher naziv 2");

        publisherRepository.save(publisher1);
        publisherRepository.save(publisher2);

        List<PublisherEntity> publishers = publisherRepository.findAll();

        assertThat(publishers).hasSize(2)
                .containsExactlyInAnyOrder(publisher1, publisher2);
    }

    @Test
    public void testFindPublisherById() {
        PublisherEntity publisher = new PublisherEntity();
        publisher.setPublisher("Publisher naziv");
        PublisherEntity savedPublisher = publisherRepository.save(publisher);
        Optional<PublisherEntity> foundPublisher = publisherRepository.findById(savedPublisher.getId());
        assertThat(foundPublisher).isPresent().hasValue(savedPublisher);
    }

    @Test
    public void testSavePublisher() {
        PublisherEntity publisher = new PublisherEntity();
        publisher.setPublisher("Publisher naziv");
        PublisherEntity savedPublisher = publisherRepository.save(publisher);
        assertThat(savedPublisher).isNotNull();
        assertThat(savedPublisher.getId()).isNotNull();
    }

    @Test
    public void testUpdatePublisher() {
        PublisherEntity publisher = new PublisherEntity();
        publisher.setPublisher("Publisher naziv");
        PublisherEntity savedPublisher = publisherRepository.save(publisher);
        savedPublisher.setPublisher("Updated Publisher");
        PublisherEntity updatedPublisher = publisherRepository.save(savedPublisher);
        assertThat(updatedPublisher.getPublisher()).isEqualTo("Updated Publisher");
    }

    @Test
    public void testDeletePublisher() {
        PublisherEntity publisher = new PublisherEntity();
        publisher.setPublisher("Publisher naziv");
        PublisherEntity savedPublisher = publisherRepository.save(publisher);
        publisherRepository.deleteById(savedPublisher.getId());
        Optional<PublisherEntity> deletedPublisher = publisherRepository.findById(savedPublisher.getId());
        assertThat(deletedPublisher).isNotPresent();
    }
}
