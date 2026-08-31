.class public final LZ2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "RequestInspection"

    .line 5
    .line 6
    invoke-virtual {p1, p0, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LZ2/b;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "keys(...)"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v4, "getDefault(...)"

    .line 40
    .line 41
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v4, "toLowerCase(...)"

    .line 49
    .line 50
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-object p0
.end method

.method public static b(Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    const-string v0, "radio"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "checkbox"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    :cond_0
    if-nez p1, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return p0
.end method


# virtual methods
.method public final recordFetch(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "method"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "body"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "headers"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "trace"

    .line 22
    .line 23
    move-object v8, p5

    .line 24
    invoke-static {p5, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "RequestInspectorJs"

    .line 28
    .line 29
    const-string v2, "Recorded fetch from JavaScript"

    .line 30
    .line 31
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    invoke-static {p4}, LZ2/b;->a(Ljava/lang/String;)Ljava/util/HashMap;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    new-instance v1, LZ2/a;

    .line 39
    .line 40
    sget-object v2, LZ2/f;->q:LZ2/f;

    .line 41
    .line 42
    sget-object v6, Ln5/t;->q:Ln5/t;

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    move-object v3, p1

    .line 46
    move-object v4, p2

    .line 47
    move-object v5, p3

    .line 48
    invoke-direct/range {v1 .. v9}, LZ2/a;-><init>(LZ2/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, LZ2/b;->a:Ljava/util/ArrayList;

    .line 52
    .line 53
    monitor-enter v2

    .line 54
    :try_start_0
    iget-object v0, p0, LZ2/b;->a:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    monitor-exit v2

    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    monitor-exit v2

    .line 63
    throw v0
.end method

.method public final recordFormSubmission(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 19
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v10, p6

    .line 4
    .line 5
    const-string v2, "RequestInspectorJs"

    .line 6
    .line 7
    const-string v3, "="

    .line 8
    .line 9
    const-string v4, "\n"

    .line 10
    .line 11
    const-string v5, "toString(...)"

    .line 12
    .line 13
    const-string v6, "content-type"

    .line 14
    .line 15
    const-string v7, "type"

    .line 16
    .line 17
    const-string v8, "checked"

    .line 18
    .line 19
    const-string v9, "value"

    .line 20
    .line 21
    const-string v11, "name"

    .line 22
    .line 23
    const-string v12, "null cannot be cast to non-null type org.json.JSONObject"

    .line 24
    .line 25
    const-string v13, "url"

    .line 26
    .line 27
    move-object/from16 v14, p1

    .line 28
    .line 29
    invoke-static {v14, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v13, "method"

    .line 33
    .line 34
    move-object/from16 v15, p2

    .line 35
    .line 36
    invoke-static {v15, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v13, "formParameterList"

    .line 40
    .line 41
    invoke-static {v0, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v13, "headers"

    .line 45
    .line 46
    move-object/from16 v14, p4

    .line 47
    .line 48
    invoke-static {v14, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v13, "trace"

    .line 52
    .line 53
    move-object/from16 v14, p5

    .line 54
    .line 55
    invoke-static {v14, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v13, Lorg/json/JSONArray;

    .line 59
    .line 60
    invoke-direct {v13, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static/range {p4 .. p4}, LZ2/b;->a(Ljava/lang/String;)Ljava/util/HashMap;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v14, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 73
    .line 74
    .line 75
    move-result v15

    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    move/from16 v1, v16

    .line 79
    .line 80
    :goto_0
    if-ge v1, v15, :cond_1

    .line 81
    .line 82
    move/from16 p3, v15

    .line 83
    .line 84
    invoke-virtual {v13, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v15

    .line 88
    invoke-static {v15, v12}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    check-cast v15, Lorg/json/JSONObject;

    .line 92
    .line 93
    move/from16 p4, v1

    .line 94
    .line 95
    invoke-virtual {v15, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    move-object/from16 v17, v2

    .line 100
    .line 101
    invoke-virtual {v15, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    move-object/from16 v18, v5

    .line 106
    .line 107
    invoke-virtual {v15, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    invoke-virtual {v15, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    invoke-static {v15}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v15, v5}, LZ2/b;->b(Ljava/lang/String;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-nez v5, :cond_0

    .line 123
    .line 124
    invoke-virtual {v14, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_0
    add-int/lit8 v1, p4, 0x1

    .line 128
    .line 129
    move/from16 v15, p3

    .line 130
    .line 131
    move-object/from16 v2, v17

    .line 132
    .line 133
    move-object/from16 v5, v18

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_1
    move-object/from16 v17, v2

    .line 137
    .line 138
    move-object/from16 v18, v5

    .line 139
    .line 140
    if-eqz v10, :cond_2

    .line 141
    .line 142
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    const v2, -0x588bff22

    .line 147
    .line 148
    .line 149
    if-eq v1, v2, :cond_c

    .line 150
    .line 151
    const v2, -0x270ace90

    .line 152
    .line 153
    .line 154
    if-eq v1, v2, :cond_8

    .line 155
    .line 156
    const v2, 0x30b78e68

    .line 157
    .line 158
    .line 159
    if-eq v1, v2, :cond_3

    .line 160
    .line 161
    :cond_2
    :goto_1
    move-object/from16 p3, v0

    .line 162
    .line 163
    goto/16 :goto_7

    .line 164
    .line 165
    :cond_3
    const-string v1, "text/plain"

    .line 166
    .line 167
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-nez v1, :cond_4

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_4
    invoke-virtual {v0, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    move/from16 v5, v16

    .line 187
    .line 188
    :goto_2
    if-ge v5, v2, :cond_7

    .line 189
    .line 190
    invoke-virtual {v13, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-static {v6, v12}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    check-cast v6, Lorg/json/JSONObject;

    .line 198
    .line 199
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v15

    .line 203
    move/from16 p3, v2

    .line 204
    .line 205
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    move/from16 v16, v5

    .line 210
    .line 211
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v6, v5}, LZ2/b;->b(Ljava/lang/String;Z)Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    if-nez v5, :cond_6

    .line 227
    .line 228
    if-eqz v16, :cond_5

    .line 229
    .line 230
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    :cond_5
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    :cond_6
    add-int/lit8 v5, v16, 0x1

    .line 243
    .line 244
    move/from16 v2, p3

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    move-object/from16 v2, v18

    .line 252
    .line 253
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :goto_3
    move-object/from16 p3, v0

    .line 257
    .line 258
    :goto_4
    move-object v6, v1

    .line 259
    move-object/from16 v1, v17

    .line 260
    .line 261
    goto/16 :goto_8

    .line 262
    .line 263
    :cond_8
    move-object/from16 v2, v18

    .line 264
    .line 265
    const-string v1, "multipart/form-data"

    .line 266
    .line 267
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-nez v1, :cond_9

    .line 272
    .line 273
    goto :goto_1

    .line 274
    :cond_9
    const-string v1, "multipart/form-data; boundary=----WebKitFormBoundaryU7CgQs9WnqlZYKs6"

    .line 275
    .line 276
    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    new-instance v1, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    move/from16 v5, v16

    .line 289
    .line 290
    :goto_5
    if-ge v5, v3, :cond_b

    .line 291
    .line 292
    invoke-virtual {v13, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-static {v6, v12}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    check-cast v6, Lorg/json/JSONObject;

    .line 300
    .line 301
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v15

    .line 305
    move/from16 p3, v3

    .line 306
    .line 307
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    move/from16 v16, v5

    .line 312
    .line 313
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-static {v6, v5}, LZ2/b;->b(Ljava/lang/String;Z)Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-nez v5, :cond_a

    .line 329
    .line 330
    const-string v5, "------WebKitFormBoundaryU7CgQs9WnqlZYKs6\n"

    .line 331
    .line 332
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    new-instance v5, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    const-string v6, "Content-Disposition: form-data; name=\""

    .line 338
    .line 339
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    const-string v6, "\""

    .line 346
    .line 347
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const-string v5, "\n\n"

    .line 358
    .line 359
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    :cond_a
    add-int/lit8 v5, v16, 0x1

    .line 369
    .line 370
    move/from16 v3, p3

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_b
    const-string v3, "------WebKitFormBoundaryU7CgQs9WnqlZYKs6--"

    .line 374
    .line 375
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    goto/16 :goto_3

    .line 386
    .line 387
    :cond_c
    move-object/from16 v2, v18

    .line 388
    .line 389
    const-string v1, "application/x-www-form-urlencoded"

    .line 390
    .line 391
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-nez v1, :cond_d

    .line 396
    .line 397
    goto/16 :goto_1

    .line 398
    .line 399
    :cond_d
    invoke-virtual {v0, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    new-instance v1, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    move/from16 v5, v16

    .line 412
    .line 413
    :goto_6
    if-ge v5, v4, :cond_10

    .line 414
    .line 415
    invoke-virtual {v13, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v6

    .line 419
    invoke-static {v6, v12}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    check-cast v6, Lorg/json/JSONObject;

    .line 423
    .line 424
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v15

    .line 428
    move-object/from16 p3, v0

    .line 429
    .line 430
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    move/from16 p4, v4

    .line 435
    .line 436
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    move/from16 v16, v5

    .line 445
    .line 446
    const-string v5, "UTF-8"

    .line 447
    .line 448
    invoke-static {v0, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    invoke-static {v6, v4}, LZ2/b;->b(Ljava/lang/String;Z)Z

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    if-nez v4, :cond_f

    .line 460
    .line 461
    if-eqz v16, :cond_e

    .line 462
    .line 463
    const-string v4, "&"

    .line 464
    .line 465
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    :cond_e
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    :cond_f
    add-int/lit8 v5, v16, 0x1

    .line 478
    .line 479
    move-object/from16 v0, p3

    .line 480
    .line 481
    move/from16 v4, p4

    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_10
    move-object/from16 p3, v0

    .line 485
    .line 486
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    goto/16 :goto_4

    .line 494
    .line 495
    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 496
    .line 497
    const-string v1, "Incorrect encoding received from JavaScript: "

    .line 498
    .line 499
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    move-object/from16 v1, v17

    .line 510
    .line 511
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 512
    .line 513
    .line 514
    const-string v0, ""

    .line 515
    .line 516
    move-object v6, v0

    .line 517
    :goto_8
    const-string v0, "Recorded form submission from JavaScript"

    .line 518
    .line 519
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 520
    .line 521
    .line 522
    new-instance v2, LZ2/a;

    .line 523
    .line 524
    sget-object v3, LZ2/f;->s:LZ2/f;

    .line 525
    .line 526
    move-object/from16 v4, p1

    .line 527
    .line 528
    move-object/from16 v5, p2

    .line 529
    .line 530
    move-object/from16 v8, p3

    .line 531
    .line 532
    move-object/from16 v9, p5

    .line 533
    .line 534
    move-object v7, v14

    .line 535
    invoke-direct/range {v2 .. v10}, LZ2/a;-><init>(LZ2/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    move-object/from16 v1, p0

    .line 539
    .line 540
    iget-object v3, v1, LZ2/b;->a:Ljava/util/ArrayList;

    .line 541
    .line 542
    monitor-enter v3

    .line 543
    :try_start_0
    iget-object v0, v1, LZ2/b;->a:Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 546
    .line 547
    .line 548
    monitor-exit v3

    .line 549
    return-void

    .line 550
    :catchall_0
    move-exception v0

    .line 551
    monitor-exit v3

    .line 552
    throw v0
.end method

.method public final recordXhr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "method"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "body"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "headers"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "trace"

    .line 22
    .line 23
    move-object v8, p5

    .line 24
    invoke-static {p5, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "RequestInspectorJs"

    .line 28
    .line 29
    const-string v2, "Recorded XHR from JavaScript"

    .line 30
    .line 31
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    invoke-static {p4}, LZ2/b;->a(Ljava/lang/String;)Ljava/util/HashMap;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    new-instance v1, LZ2/a;

    .line 39
    .line 40
    sget-object v2, LZ2/f;->r:LZ2/f;

    .line 41
    .line 42
    sget-object v6, Ln5/t;->q:Ln5/t;

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    move-object v3, p1

    .line 46
    move-object v4, p2

    .line 47
    move-object v5, p3

    .line 48
    invoke-direct/range {v1 .. v9}, LZ2/a;-><init>(LZ2/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, LZ2/b;->a:Ljava/util/ArrayList;

    .line 52
    .line 53
    monitor-enter v2

    .line 54
    :try_start_0
    iget-object v0, p0, LZ2/b;->a:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    monitor-exit v2

    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    monitor-exit v2

    .line 63
    throw v0
.end method
