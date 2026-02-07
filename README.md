# 🪙 Conversor de Monedas -

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GSON](https://img.shields.io/badge/Gson-007ACC?style=for-the-badge&logo=google&logoColor=white)

Este es un práctico conversor de divisas desarrollado en Java. El programa permite realizar conversiones entre diferentes monedas (Dólares, Pesos Mexicanos, Pesos Argentinos y Euros) utilizando tasas de cambio obtenidas en tiempo real a través de una API externa.

---

## 📋 Características

- **Tasas en tiempo real:** Utiliza una API para obtener el valor del mercado al momento.
- **Menú Interactivo:** Navegación sencilla mediante opciones numéricas.
- **Consumo de JSON:** Implementación de la librería **GSON** para procesar las respuestas de la API.
- **Validación de Datos:** Manejo de excepciones para evitar errores si el usuario ingresa caracteres no válidos.

---

## 📸 Capturas de Pantalla

### Menú Principal
<img width="796" height="336" alt="Screenshot from 2026-02-07 11-18-33" src="https://github.com/user-attachments/assets/f7083325-bb79-458c-8204-19bf5f973a6e" />

---
### Ejemplo de Conversión

<img width="838" height="499" alt="Screenshot from 2026-02-07 11-19-14" src="https://github.com/user-attachments/assets/ee58cd31-2a9a-41c6-a0df-473d7a01cfdd" />
*Descripción: Resultado de convertir un monto específico entre dos divisas.*

---

## 🛠️ Requisitos y Tecnologías

1. **Java JDK 17 o superior.**
2. **Librería GSON:** Para el mapeo de los datos JSON a objetos Java.
3. **API Key:** Es necesario contar con una clave de [ExchangeRate-API](https://www.exchangerate-api.com/).

---
