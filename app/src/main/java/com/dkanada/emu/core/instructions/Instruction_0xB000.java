package com.dkanada.emu.core.instructions;

import com.dkanada.emu.core.CPU;
import com.dkanada.emu.core.Core;
import com.dkanada.emu.core.OPCode;

public class Instruction_0xB000 implements Instruction {
    @Override
    public void execute(Core core, CPU cpu, OPCode opcode) {
        cpu.pc = (char) (cpu.v[0] + opcode.getNNN());
    }
}
