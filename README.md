# Rejestr pracowników
Implementacje logiki rejestru pracowników.

<br></br>
Korporacja charakteryzuje się trzema podstawowymi typami zatrudnionych pracowników:
- **Pracownik biurowy**: charakteryzuje się następującymi cechami istotnymi dla korporacji:
    - identyfikator pracownika: unikalny dla każdego pracownika w obrębie całej korporacji
    - imię
    - nazwisko
    - wiek
    - doświadczenie
    - adres budynku w którym pracuje: adres powinien składać się z czterech elementów:
        - nazwy ulicy 
        - numeru budynku 
        - numeru lokalu 
        - nazwy miasta
    - identyfikator stanowiska biurowego: unikalny w skali całej korporacji
    - intelekt: wyrażony w iq w skali 70 - 150

- **Pracownik fizyczny**: charakteryzuje się następującymi cechami istotnymi dla korporacji:
    - identyfikator pracownika: unikalny dla każdego pracownika w obrębie całej korporacji
    - imię
    - nazwisko
    - wiek
    - doświadczenie
    - adres budynku w którym pracuje: adres powinien składać się z czterech elementów:
        - nazwy ulicy 
        - numeru budynku 
        - numeru lokalu 
        - nazwy miasta
    - siła fizyczna - wyrażona w skali od 1 - 100

- **Handlarz**: charakteryzuje się następującymi cechami istotnymi dla korporacji:
    - identyfikator pracownika: unikalny dla każdego pracownika w obrębie całej korporacji
    - imię
    - nazwisko
    - wiek
    - doświadczenie
    - adres budynku w którym pracuje: adres powinien składać się z czterech elementów:
        - nazwy ulicy 
        - numeru budynku 
        - numeru lokalu 
        - nazwy miasta
    - skuteczność: wyrażona w trzech stałych typach ``NISKA``, ``ŚREDNIA``, ``WYSOKA`` 
    - wysokość prowizji: wyrażona w procentach

Rejestr umożliwia realizację następujących zadań:
- dodanie dowolnego z typów pracownika do rejestru
- usunięcie pracownika o danym identyfikatorze pracowniczym z rejestru
- dodanie kilku pracowników o różnych typach na raz do rejestru
- wyświetlenie listy wszystkich pracowników posortowanych po liczbie lat doświadczenia (malejąco),
 następnie po wieku pracownika (rosnąco), 
 następnie po nazwisku pracownika (zgodnie z kolejnością alfabetyczną)
- wyświetlenie listy pracowników, którzy pracują w mieście po nazwie podanej 
 jako parametr wejściowy
- wyświetlenie listy wszystkich pracowników wraz  z ich wartością dla korporacji, 
 przy czym dla każdego z typów pracownika stopień wartości obliczany jest w inny sposób:
    - dla pracownika biurowego: wartość dla korporacji obliczana jest 
    ze wzoru: ``doświadczenie * intelekt``
    - dla pracownika fizycznego: wartość dla korporacji obliczana jest 
    ze wzoru ``doświadczenie * siła / wiek``
    - dla handlowca: wartość dla korporacji obliczana jest 
    ze wzoru ``doświadczenie * skuteczność``, 
    gdzie odpowiedni typ skuteczności zamieniany jest na wartość
        - ``NISKA``: 60
        - ``ŚREDNIA``: 90
        - ``WYSOKA``: 120

<br></br>
__Projekt zawiera odpowiednie testy jednostkowe do implementowanej funkcjonalności.__
