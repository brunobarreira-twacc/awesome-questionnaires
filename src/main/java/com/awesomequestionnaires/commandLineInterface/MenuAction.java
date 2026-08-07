package com.awesomequestionnaires.commandLineInterface;

import java.io.IOException;

public interface MenuAction {
    ExecutionSteps execute(CliContext context) throws IOException; 
}
