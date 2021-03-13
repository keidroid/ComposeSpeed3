/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package red.torch.composespeed.ui.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import red.torch.composespeed.data.chipMocks
import red.torch.composespeed.ui.theme.MyTheme

@Composable
fun TopChips() {
    LazyRow(
        contentPadding = PaddingValues(start = 16.dp),
        modifier = Modifier
            .padding(vertical = 16.dp)
    ) {
        chipMocks.forEach {
            item {
                MyTheme { // bug?
                    TopChipItem(it.first, it.second)
                }
            }
        }
    }
}