/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.tools.ant.types.optional.imageio;

import java.awt.image.BufferedImage;

/**
 * Interface which represents an Operation which is "drawable", such
 * as a Rectangle, Circle or Text.  The Operation is responsible for
 * creating its own image buffer and drawing itself into it, then
 * wrapping and returning it as a PlanarImage.  This allows multiple
 * "drawable" objects to be nested.
 *
 * @see org.apache.tools.ant.taskdefs.optional.image.ImageIOTask
 */
public interface DrawOperation {
    /**
     * Abstract method which is intended to create an image buffer
     * and return it so it can be drawn into another object.  Use
     * an Alpha channel for a "transparent" background.
     * @return a planar image
     */
    BufferedImage executeDrawOperation();
}
