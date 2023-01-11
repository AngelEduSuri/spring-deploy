package com.aesuriagasalazar.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

//    @Value("${app.varexample}")
//    private String user;

    @GetMapping("/api/hello")
    public String welcome() {
//        System.out.println(user);
        return "Hello User";
    }

    @GetMapping("/")
    public String home() {
        return "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\"\n" +
                "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Ejercicio de Introducción a HTML en OpenBootcamp</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<!--Este es mi primer comentario\n" +
                "de dos líneas-->\n" +
                "<!--Aprendiendo a documentar mi código con OpenBootcamp-->\n" +
                "\n" +
                "<div>\n" +
                "    <h4>Lista desordenada de tres videos favoritos de Youtube</h4>\n" +
                "    <ul>\n" +
                "        <li><a href=\"https://www.youtube.com/watch?v=0FXJUP6_O1w\" target=\"_blank\">Where Are the Stars? See How Light\n" +
                "            Pollution Affects Night Skies</a></li>\n" +
                "        <li><a href=\"https://www.youtube.com/watch?v=udAL48P5NJU\" target=\"_blank\">Los Gigapixeles de Andromeda</a></li>\n" +
                "        <li><a href=\"https://www.youtube.com/watch?v=KaOC9danxNo\" target=\"_blank\">Space Oddity</a></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "<!--Form-->\n" +
                "<form action=\"result.html\" method=\"GET\">\n" +
                "    <div>\n" +
                "        <label for=\"username\">Nombre de usuario</label>\n" +
                "        <input id=\"username\" type=\"text\" name=\"username\" required>\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <label for=\"comment\">Comentario</label>\n" +
                "        <textarea id=\"comment\" name=\"comment\"></textarea>\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <label for=\"phone\">Teléfono</label>\n" +
                "        <input  id= \"phone\" type=\"number\" name=\"phone\" min=\"0\", maxlength=\"10\">\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <label for=\"email\">Email</label>\n" +
                "        <input  id= \"email\" type=\"email\" name=\"email\">\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <label for=\"date\">Fecha</label>\n" +
                "        <input  id= \"date\" type=\"date\" name=\"date\" required>\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <label for=\"pass\">Contraseña</label>\n" +
                "        <input  id= \"pass\" type=\"password\" name=\"pass\" required>\n" +
                "    </div>\n" +
                "    <button type=\"reset\">Reset</button>\n" +
                "    <button type=\"submit\">Enviar</button>\n" +
                "</form>\n" +
                "\n" +
                "<p>Tablas</p>\n" +
                "\n" +
                "<table>\n" +
                "    <tr>\n" +
                "        <th>Persona</th>\n" +
                "        <th>Lunes</th>\n" +
                "        <th>Martes</th>\n" +
                "        <th>Miércoles</th>\n" +
                "        <th>Jueves</th>\n" +
                "        <th>Viernes</th>\n" +
                "        <th>Sábado</th>\n" +
                "        <th>Domingo</th>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>Edu</td>\n" +
                "        <td>9 - 11</td>\n" +
                "        <td>9 - 11</td>\n" +
                "        <td>9 - 11</td>\n" +
                "        <td>9 - 11</td>\n" +
                "        <td>9 - 11</td>\n" +
                "        <td>Descanso</td>\n" +
                "        <td>Descanso</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>Angel</td>\n" +
                "        <td>1 - 5</td>\n" +
                "        <td>1 - 5</td>\n" +
                "        <td>1 - 5</td>\n" +
                "        <td>1 - 5</td>\n" +
                "        <td>1 - 5</td>\n" +
                "        <td>1 - 5</td>\n" +
                "        <td>Descanso</td>\n" +
                "    </tr>\n" +
                "</table>\n" +
                "\n" +
                "<style>\n" +
                "\n" +
                "    table {\n" +
                "        color: white;\n" +
                "    }\n" +
                "\n" +
                "    table, th, td {\n" +
                "        border: 2px white solid;\n" +
                "        border-collapse: collapse;\n" +
                "    }\n" +
                "\n" +
                "    th, td {\n" +
                "        background-color: darkcyan;\n" +
                "    }\n" +
                "</style>\n" +
                "</body>\n" +
                "</html>";
    }
}
