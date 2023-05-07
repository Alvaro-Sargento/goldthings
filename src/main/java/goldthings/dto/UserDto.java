package goldthings.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;

    @NotEmpty(message = "Por favor digite um nome válido.")
    private String name;

    @NotEmpty(message = "Por favor digite email válido.")
    @Email
    private String email;

    @NotEmpty(message = "Por favor digite uma password válida.")
    private String password;
}
