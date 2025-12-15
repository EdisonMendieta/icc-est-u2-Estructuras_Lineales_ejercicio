from sign_validator import SignValidator


def run_sign_validator():
    sign_validator = SignValidator()

    cadena1 = "{[()]}"   # VÁLIDO
    cadena2 = "{[(])}"   # NO VÁLIDO

    print(f"Cadena: {cadena1} es válida? {sign_validator.is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es válida? {sign_validator.is_valid(cadena2)}")


if __name__ == "__main__":
    run_sign_validator()
