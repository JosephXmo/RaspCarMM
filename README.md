# RaspCarMM
A classic multimedia head unit system. Powered by Raspberry Pi 4B/5.

## Features

- **Audio Sources**: Supports four audio sources: CD, Radio, Aux, and Bluetooth.
- **Bluetooth Audio Streaming**: Allows real-time streaming from mobile devices or other players.
- **Modular Design**: Components like the AudioEngine module, SourceCD module, and other future features will be
  implemented in a modular fashion, with support for multi-threading and parallel processing.
- **Real-time System**: Leverages Java for building the system on Raspberry Pi, providing smooth,
  responsive control for car multimedia.

## Project Structure

The current implementation uses Java SE and is designed to run on the **Raspberry Pi 4**.
The system will be extended with multiple components for various functionalities, including audio playback,
source management, and Bluetooth connectivity.

### Main Components

- **AudioEngine**: The central module for managing audio input and output across various sources.
- **SourceCD**: A module for handling CD audio source input and playback, running on a separate thread.
- **Bluetooth Streaming**: Integration with Bluetooth audio protocols like A2DP
  for streaming audio from devices like mobile phones.
- **FM/AM Radio**: Support for tuning and audio playback from FM/AM radio.
- **Aux Input**: Allows for direct audio input from auxiliary sources like an AUX cable.

## Requirements

- **Java 17 or higher** (Recommended OpenJDK version)
- **Raspberry Pi 4** or compatible ARM-based device
- **Pi4J** for hardware interfacing
- **ALSA**, **PulseAudio**, and **BlueZ** for audio and Bluetooth functionality

## Build & Installation

### Prerequisites

- Install OpenJDK 21 or higher on your Raspberry Pi.
- Check if your Linux distribution has **ALSA**, **PulseAudio**, and **BlueZ** for Bluetooth support.

## License

This project is licensed under the **GNU General Public License v3.0**.

You may obtain a copy of the full license text in the `GPLv3` file
or at [GNU.org](https://www.gnu.org/licenses/gpl-3.0.html).

### Third-party components and licenses:

1. **Pi4J** - Apache License 2.0
2. **ALSA** - GNU Lesser General Public License v2.1 (LGPL-2.1)
3. **PulseAudio** - GNU Lesser General Public License v2.1 and GNU General Public License v2.0
4. **BlueZ** - GNU General Public License v2.0

For more information, please refer to the individual licenses for each third-party component.

## Commercial Licensing

RaspCarMM is released under GPLv3. For commercial licensing inquiries,
please contact **AriaNet** via [E-mail](qhdqsb@hotmail.com).

## Acknowledgments

Special thanks to the developers of **Pi4J**, **ALSA**, **PulseAudio**, and **BlueZ**
for providing the core libraries and tools that make this project possible.
