# Actividad 2: Spring MVC con Thymeleaf

Proyecto de Antonio Vázquez Karla Guadalupe
Copia de la Actividad 1 (`AVKGact1_t4`) ampliada con 
- Spring MVC
- Thymeleaf
- DTO
- `@RequestParam`
- `@PathVariable`
- `@ModelAttribute`
- `@Value`
- endpoint POST REST.


## Estructura
- `MateriaDTO`: datos de la materia (nombre, créditos, semestre).
- `MateriaController`: controlador MVC (vistas Thymeleaf), ruta base `/web`.
- `MateriaApiController`: controlador REST (JSON).
- Vistas: `lista.html`, `formulario.html`, `detalle.html`.

## Endpoints
| Método | Ruta | Descripción |
|---|---|---|
| GET | `/web/materias` | Lista con `th:each` |
| GET | `/web/filtrar?semestre=5` | Filtra con `@RequestParam` |
| GET | `/web/materia/{id}` | Detalle con `@PathVariable` |
| GET | `/web/nueva` | Formulario |
| POST | `/web/nueva` | Recibe datos con `@ModelAttribute` |
| POST | `/api/materias` | Recibe JSON con el DTO (`@RequestBody`) |

`@Value` se muestra en las vistas con mi nombre Karla Antonio

## Capturas

### Lista con th:each
<img width="1067" height="606" alt="image" src="https://github.com/user-attachments/assets/dd7f5136-f806-4887-b217-8c0d6dd35366" />

### Formulario con @ModelAttribute
<img width="762" height="508" alt="image" src="https://github.com/user-attachments/assets/57da3981-49f8-4a57-990b-3aa8aea9b3e4" />
<img width="838" height="563" alt="image" src="https://github.com/user-attachments/assets/c27439a2-0120-4fc4-a2e5-c394560a82f0" />

### @RequestParam
<img width="985" height="516" alt="image" src="https://github.com/user-attachments/assets/cc08f12a-637d-41f9-8d40-d394a5719893" />

### @PathVariable
<img width="757" height="609" alt="image" src="https://github.com/user-attachments/assets/ad963d7a-4b7e-4206-a9b9-df107e6e0d65" />

### POST probado en Postman
<img width="1605" height="999" alt="image" src="https://github.com/user-attachments/assets/0a85a63f-4a5c-46e4-a8d1-7f379a52ea25" />

## Despliegue en el VPS
Las 2 actividades siguen funcionando correctamente, cada una en un puerto diferente
- Actividad 1: http://138.68.234.30:8082/proyecto
<img width="1257" height="507" alt="image" src="https://github.com/user-attachments/assets/d6073a55-5d8d-4188-95b0-a303c5a6230e" />

- Actividad 2: http://138.68.234.30:8084/web/materias
<img width="1261" height="688" alt="image" src="https://github.com/user-attachments/assets/63106ff3-7d9c-47f2-90c0-cf71db228533" />

### Links VPS 
- Lista: http://138.68.234.30:8084/web/materias
- Formulario: http://138.68.234.30:8084/web/nueva
- RequestParam: http://138.68.234.30:8084/web/filtrar?semestre=5
- PathVariable: http://138.68.234.30:8084/web/materia/1
- POST: http://138.68.234.30:8084/api/materias
  
