package org.example.it355dz08.security;


import lombok.RequiredArgsConstructor;
import org.example.it355dz08.entity.UserEntity;
import org.example.it355dz08.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserEntityDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{
    private final UserRepository ur;

    @Override
    public UserEntityDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = ur.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found!"));

        return new org.example.it355dz08.security.UserEntityDetails(user);
    }
}
