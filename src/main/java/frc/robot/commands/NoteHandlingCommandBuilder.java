package frc.robot.commands;
import java.util.function.Supplier;
import frc.robot.command.Command;
import frc.robot.command.InstantCommand;
import frc.robot.command.ParallelCommandGroup;
import frc.robot.command.RunCommand;
import frc.robot.command.SequentialCommandGroup; 

import frc.robot.subsystems.NoteHandling.GeneralRoller;
import frc.robot.subsystems.NoteHandling.GeneralRoller.GeneralRollerStates;

// We are gonna be writing commands today, use this doc to progress through the training:
// https://docs.google.com/document/d/1iaDaoYRCIEgX1hY3d1hFmAgDCdyEqP5SY_TVuxs04kA/edit?tab=t.0

public class NoteHandlingCommandBuilder {

    public static Command generalRollerRunForward(GeneralRoller roller){

        // Instantiate a command/command group here, then return it. Remember to use the keyword "new" when instantiating an object
        Command forward = new InstantCommand(()-> roller.requestState(GeneralRollerStates.StateForward));


        return forward;

    }

    // Repeat above for the other 2 commands specified in the doc

    public static Command generalRollerRunBackward(GeneralRoller roller){

        Command back = new InstantCommand(()-> roller.requestState(GeneralRollerStates.StateBackward));
        return back;

    }

    public static Command generalRollerStopRunning(GeneralRoller roller){

        Command stop = new RunCommand(()-> roller.requestState(GeneralRollerStates.StateOff));
        return stop;
    }

}