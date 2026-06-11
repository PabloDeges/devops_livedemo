package com.livedemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String test() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>DevOps Demo Seite </title>
            </head>
            <body style="font-family: 'Segoe UI', Arial, sans-serif;display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; color: #f8fafc;">
                
                <div style=" padding: 3rem; border-radius: 16px; text-align: center; max-width: 800px;">
                    
                    <h1 style="font-size: 3rem; margin: 0 0 10px 0; color: #38bdf8;">DevOps Präsi Demo Seite</h1>
                    <p style="font-size: 1.2rem; color: #94a3b8; margin-bottom: 40px;">Auf dieser Seite muss ein wichtiger Tippfehler gefixt werden</p>
                    
                    <hr style="border: 0; border-top: 1px solid #334155; margin-bottom: 30px;">
                    
                    <ul style="text-align: left; color: black; font-size: 1.4rem; list-style: none; padding: 0; margin: 0; line-height: 2.2;">
                        <li style="text-color: black;"> Hier stehen ganz wichtige Sachen </li>
                        <li style="text-color: black;">Wird der Sourcecode geändert, wird die GitHub Action getriggert</li>
                        <li style="text-color: black;">Tippfehler hier: Agiles Projektmanagement ist gut</li>
                    </ul>
                    
                </div>
                
            </body>
            </html>
            """;
    }
}