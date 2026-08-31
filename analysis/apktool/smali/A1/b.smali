.class public final LA1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA1/b;->q:I

    iput-object p2, p0, LA1/b;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LO3/T1;LE1/p;)V
    .locals 0

    const/16 p2, 0xa

    iput p2, p0, LA1/b;->q:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/b;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LO3/d0;Z)V
    .locals 0

    const/4 p2, 0x6

    iput p2, p0, LA1/b;->q:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/b;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv3/m;LU/l;)V
    .locals 0

    const/16 p1, 0x19

    iput p1, p0, LA1/b;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA1/b;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lo5/g;
    .locals 5

    .line 1
    iget-object v0, p0, LA1/b;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/room/q;

    .line 4
    .line 5
    new-instance v1, Lo5/g;

    .line 6
    .line 7
    invoke-direct {v1}, Lo5/g;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Landroidx/room/q;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 11
    .line 12
    new-instance v2, LZ/m;

    .line 13
    .line 14
    const-string v3, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"

    .line 15
    .line 16
    invoke-direct {v2, v3}, LZ/m;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x2

    .line 21
    invoke-static {v0, v2, v3, v4, v3}, Landroidx/room/w;->query$default(Landroidx/room/w;Lj2/f;Landroid/os/CancellationSignal;ILjava/lang/Object;)Landroid/database/Cursor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Lo5/g;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Ln5/A;->m(Lo5/g;)Lo5/g;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, v0, Lo5/g;->q:Lo5/e;

    .line 54
    .line 55
    invoke-virtual {v1}, Lo5/e;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    iget-object v1, p0, LA1/b;->r:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Landroidx/room/q;

    .line 64
    .line 65
    iget-object v1, v1, Landroidx/room/q;->h:Lj2/g;

    .line 66
    .line 67
    const-string v2, "Required value was null."

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    iget-object v1, p0, LA1/b;->r:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Landroidx/room/q;

    .line 74
    .line 75
    iget-object v1, v1, Landroidx/room/q;->h:Lj2/g;

    .line 76
    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    invoke-interface {v1}, Lj2/g;->q()I

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 84
    .line 85
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_3
    return-object v0

    .line 96
    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    :catchall_1
    move-exception v2

    .line 98
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw v2
.end method

.method public final run()V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LA1/b;->q:I

    .line 4
    .line 5
    const-wide/16 v3, -0x1

    .line 6
    .line 7
    const/4 v5, 0x3

    .line 8
    const/4 v8, 0x0

    .line 9
    const/4 v11, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->s:Lv4/m;

    .line 18
    .line 19
    iget-object v0, v0, Lv4/m;->w:Lcom/google/android/material/internal/CheckableImageButton;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    throw v8

    .line 29
    :pswitch_1
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lv3/x;

    .line 32
    .line 33
    iget-object v0, v0, Lv3/x;->j:LF/D;

    .line 34
    .line 35
    new-instance v2, Lcom/google/android/gms/common/b;

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    invoke-direct {v2, v3}, Lcom/google/android/gms/common/b;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LF/D;->a(Lcom/google/android/gms/common/b;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Li3/a;

    .line 48
    .line 49
    iget-object v0, v0, Li3/a;->r:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lv3/o;

    .line 52
    .line 53
    iget-object v0, v0, Lv3/o;->d:Lu3/b;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-string v3, " disconnecting because it was signed out."

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v0, v2}, Lu3/b;->d(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_3
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lv3/o;

    .line 76
    .line 77
    invoke-virtual {v0}, Lv3/o;->e()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_4
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 84
    .line 85
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/ActionMenuView;

    .line 86
    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->J:Lm/j;

    .line 90
    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    invoke-virtual {v0}, Lm/j;->n()Z

    .line 94
    .line 95
    .line 96
    :cond_0
    return-void

    .line 97
    :pswitch_5
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 100
    .line 101
    iget-boolean v2, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->v:Z

    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const-string v3, "input_method"

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 116
    .line 117
    invoke-virtual {v2, v0, v11}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 118
    .line 119
    .line 120
    iput-boolean v11, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->v:Z

    .line 121
    .line 122
    :cond_1
    return-void

    .line 123
    :pswitch_6
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Lm/p0;

    .line 126
    .line 127
    iput-object v8, v0, Lm/p0;->B:LA1/b;

    .line 128
    .line 129
    invoke-virtual {v0}, Lm/p0;->drawableStateChanged()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_2
    :goto_0
    :pswitch_7
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v2, v0

    .line 136
    check-cast v2, Lg6/d;

    .line 137
    .line 138
    monitor-enter v2

    .line 139
    :try_start_0
    invoke-virtual {v2}, Lg6/d;->c()Lg6/a;

    .line 140
    .line 141
    .line 142
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 143
    monitor-exit v2

    .line 144
    if-nez v5, :cond_3

    .line 145
    .line 146
    return-void

    .line 147
    :cond_3
    iget-object v2, v5, Lg6/a;->c:Lg6/c;

    .line 148
    .line 149
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 153
    .line 154
    move-object v6, v0

    .line 155
    check-cast v6, Lg6/d;

    .line 156
    .line 157
    sget-object v0, Lg6/d;->j:Ljava/util/logging/Logger;

    .line 158
    .line 159
    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 160
    .line 161
    invoke-virtual {v0, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-eqz v7, :cond_4

    .line 166
    .line 167
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 168
    .line 169
    .line 170
    move-result-wide v8

    .line 171
    const-string v0, "starting"

    .line 172
    .line 173
    invoke-static {v5, v2, v0}, Ly4/b;->c(Lg6/a;Lg6/c;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_4
    move-wide v8, v3

    .line 178
    :goto_1
    :try_start_1
    invoke-static {v6, v5}, Lg6/d;->a(Lg6/d;Lg6/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    .line 180
    .line 181
    if-eqz v7, :cond_2

    .line 182
    .line 183
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 184
    .line 185
    .line 186
    move-result-wide v6

    .line 187
    sub-long/2addr v6, v8

    .line 188
    invoke-static {v6, v7}, Ly4/b;->q(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    const-string v6, "finished run in "

    .line 193
    .line 194
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v5, v2, v0}, Ly4/b;->c(Lg6/a;Lg6/c;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_0

    .line 202
    :catchall_0
    move-exception v0

    .line 203
    :try_start_2
    iget-object v3, v6, Lg6/d;->a:Lk3/c;

    .line 204
    .line 205
    iget-object v3, v3, Lk3/c;->q:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 208
    .line 209
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 210
    .line 211
    .line 212
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    if-eqz v7, :cond_5

    .line 215
    .line 216
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    sub-long/2addr v3, v8

    .line 221
    invoke-static {v3, v4}, Ly4/b;->q(J)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    const-string v4, "failed a run in "

    .line 226
    .line 227
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-static {v5, v2, v3}, Ly4/b;->c(Lg6/a;Lg6/c;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_5
    throw v0

    .line 235
    :catchall_2
    move-exception v0

    .line 236
    monitor-exit v2

    .line 237
    throw v0

    .line 238
    :pswitch_8
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->A0()Z

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_9
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 249
    .line 250
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 251
    .line 252
    if-eqz v3, :cond_12

    .line 253
    .line 254
    check-cast v3, Ld2/h;

    .line 255
    .line 256
    iget-wide v4, v3, Ld2/D;->d:J

    .line 257
    .line 258
    iget-object v8, v3, Ld2/h;->h:Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    iget-object v13, v3, Ld2/h;->j:Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v14

    .line 270
    iget-object v15, v3, Ld2/h;->k:Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 273
    .line 274
    .line 275
    move-result v16

    .line 276
    const-wide/16 v17, 0x0

    .line 277
    .line 278
    iget-object v6, v3, Ld2/h;->i:Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-eqz v12, :cond_6

    .line 285
    .line 286
    if-eqz v14, :cond_6

    .line 287
    .line 288
    if-eqz v7, :cond_6

    .line 289
    .line 290
    if-eqz v16, :cond_6

    .line 291
    .line 292
    goto/16 :goto_a

    .line 293
    .line 294
    :cond_6
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    move v10, v11

    .line 299
    :goto_2
    if-ge v10, v9, :cond_7

    .line 300
    .line 301
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v20

    .line 305
    add-int/lit8 v10, v10, 0x1

    .line 306
    .line 307
    move-object/from16 v11, v20

    .line 308
    .line 309
    check-cast v11, Ld2/V;

    .line 310
    .line 311
    iget-object v2, v11, Ld2/V;->a:Landroid/view/View;

    .line 312
    .line 313
    move/from16 v22, v7

    .line 314
    .line 315
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    move-object/from16 v23, v8

    .line 320
    .line 321
    iget-object v8, v3, Ld2/h;->q:Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    move/from16 v24, v9

    .line 331
    .line 332
    const/4 v9, 0x0

    .line 333
    invoke-virtual {v8, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    new-instance v9, Ld2/c;

    .line 338
    .line 339
    invoke-direct {v9, v3, v11, v7, v2}, Ld2/c;-><init>(Ld2/h;Ld2/V;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v8, v9}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 347
    .line 348
    .line 349
    move/from16 v7, v22

    .line 350
    .line 351
    move-object/from16 v8, v23

    .line 352
    .line 353
    move/from16 v9, v24

    .line 354
    .line 355
    const/4 v11, 0x0

    .line 356
    goto :goto_2

    .line 357
    :cond_7
    move/from16 v22, v7

    .line 358
    .line 359
    move-object/from16 v23, v8

    .line 360
    .line 361
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->clear()V

    .line 362
    .line 363
    .line 364
    if-nez v14, :cond_9

    .line 365
    .line 366
    new-instance v2, Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 372
    .line 373
    .line 374
    iget-object v7, v3, Ld2/h;->m:Ljava/util/ArrayList;

    .line 375
    .line 376
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 380
    .line 381
    .line 382
    new-instance v7, Ld2/b;

    .line 383
    .line 384
    const/4 v8, 0x0

    .line 385
    invoke-direct {v7, v3, v2, v8}, Ld2/b;-><init>(Ld2/h;Ljava/util/ArrayList;I)V

    .line 386
    .line 387
    .line 388
    if-nez v12, :cond_8

    .line 389
    .line 390
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    check-cast v2, Ld2/g;

    .line 395
    .line 396
    iget-object v2, v2, Ld2/g;->a:Ld2/V;

    .line 397
    .line 398
    iget-object v2, v2, Ld2/V;->a:Landroid/view/View;

    .line 399
    .line 400
    sget-object v8, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 401
    .line 402
    invoke-virtual {v2, v7, v4, v5}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 403
    .line 404
    .line 405
    goto :goto_3

    .line 406
    :cond_8
    invoke-virtual {v7}, Ld2/b;->run()V

    .line 407
    .line 408
    .line 409
    :cond_9
    :goto_3
    if-nez v16, :cond_b

    .line 410
    .line 411
    new-instance v2, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 417
    .line 418
    .line 419
    iget-object v7, v3, Ld2/h;->n:Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    .line 425
    .line 426
    .line 427
    new-instance v7, Ld2/b;

    .line 428
    .line 429
    const/4 v8, 0x1

    .line 430
    invoke-direct {v7, v3, v2, v8}, Ld2/b;-><init>(Ld2/h;Ljava/util/ArrayList;I)V

    .line 431
    .line 432
    .line 433
    if-nez v12, :cond_a

    .line 434
    .line 435
    const/4 v8, 0x0

    .line 436
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    check-cast v2, Ld2/f;

    .line 441
    .line 442
    iget-object v2, v2, Ld2/f;->a:Ld2/V;

    .line 443
    .line 444
    iget-object v2, v2, Ld2/V;->a:Landroid/view/View;

    .line 445
    .line 446
    sget-object v8, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 447
    .line 448
    invoke-virtual {v2, v7, v4, v5}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 449
    .line 450
    .line 451
    goto :goto_4

    .line 452
    :cond_a
    invoke-virtual {v7}, Ld2/b;->run()V

    .line 453
    .line 454
    .line 455
    :cond_b
    :goto_4
    if-nez v22, :cond_11

    .line 456
    .line 457
    new-instance v2, Ljava/util/ArrayList;

    .line 458
    .line 459
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 463
    .line 464
    .line 465
    iget-object v7, v3, Ld2/h;->l:Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 471
    .line 472
    .line 473
    new-instance v6, Ld2/b;

    .line 474
    .line 475
    const/4 v7, 0x2

    .line 476
    invoke-direct {v6, v3, v2, v7}, Ld2/b;-><init>(Ld2/h;Ljava/util/ArrayList;I)V

    .line 477
    .line 478
    .line 479
    if-eqz v12, :cond_d

    .line 480
    .line 481
    if-eqz v14, :cond_d

    .line 482
    .line 483
    if-nez v16, :cond_c

    .line 484
    .line 485
    goto :goto_5

    .line 486
    :cond_c
    invoke-virtual {v6}, Ld2/b;->run()V

    .line 487
    .line 488
    .line 489
    goto :goto_9

    .line 490
    :cond_d
    :goto_5
    if-nez v12, :cond_e

    .line 491
    .line 492
    goto :goto_6

    .line 493
    :cond_e
    move-wide/from16 v4, v17

    .line 494
    .line 495
    :goto_6
    if-nez v14, :cond_f

    .line 496
    .line 497
    iget-wide v7, v3, Ld2/D;->e:J

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :cond_f
    move-wide/from16 v7, v17

    .line 501
    .line 502
    :goto_7
    if-nez v16, :cond_10

    .line 503
    .line 504
    iget-wide v9, v3, Ld2/D;->f:J

    .line 505
    .line 506
    goto :goto_8

    .line 507
    :cond_10
    move-wide/from16 v9, v17

    .line 508
    .line 509
    :goto_8
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 510
    .line 511
    .line 512
    move-result-wide v7

    .line 513
    add-long/2addr v7, v4

    .line 514
    const/4 v3, 0x0

    .line 515
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    check-cast v2, Ld2/V;

    .line 520
    .line 521
    iget-object v2, v2, Ld2/V;->a:Landroid/view/View;

    .line 522
    .line 523
    sget-object v4, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 524
    .line 525
    invoke-virtual {v2, v6, v7, v8}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 526
    .line 527
    .line 528
    goto :goto_b

    .line 529
    :cond_11
    :goto_9
    const/4 v3, 0x0

    .line 530
    goto :goto_b

    .line 531
    :cond_12
    :goto_a
    move v3, v11

    .line 532
    :goto_b
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    .line 533
    .line 534
    return-void

    .line 535
    :pswitch_a
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v0, Ld2/k;

    .line 538
    .line 539
    iget-object v2, v0, Ld2/k;->z:Landroid/animation/ValueAnimator;

    .line 540
    .line 541
    iget v3, v0, Ld2/k;->A:I

    .line 542
    .line 543
    const/4 v8, 0x1

    .line 544
    if-eq v3, v8, :cond_13

    .line 545
    .line 546
    const/4 v7, 0x2

    .line 547
    if-eq v3, v7, :cond_14

    .line 548
    .line 549
    goto :goto_c

    .line 550
    :cond_13
    const/4 v7, 0x2

    .line 551
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 552
    .line 553
    .line 554
    :cond_14
    iput v5, v0, Ld2/k;->A:I

    .line 555
    .line 556
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    check-cast v0, Ljava/lang/Float;

    .line 561
    .line 562
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    new-array v3, v7, [F

    .line 567
    .line 568
    const/4 v8, 0x0

    .line 569
    aput v0, v3, v8

    .line 570
    .line 571
    const/16 v19, 0x1

    .line 572
    .line 573
    const/16 v20, 0x0

    .line 574
    .line 575
    aput v20, v3, v19

    .line 576
    .line 577
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 578
    .line 579
    .line 580
    const/16 v0, 0x1f4

    .line 581
    .line 582
    int-to-long v3, v0

    .line 583
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 587
    .line 588
    .line 589
    :goto_c
    return-void

    .line 590
    :pswitch_b
    move v8, v11

    .line 591
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v0, Lc4/f;

    .line 594
    .line 595
    iput-boolean v8, v0, Lc4/f;->c:Z

    .line 596
    .line 597
    iget-object v2, v0, Lc4/f;->e:Li1/b;

    .line 598
    .line 599
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 600
    .line 601
    iget-object v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:LD1/d;

    .line 602
    .line 603
    if-eqz v3, :cond_15

    .line 604
    .line 605
    invoke-virtual {v3}, LD1/d;->f()Z

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    if-eqz v3, :cond_15

    .line 610
    .line 611
    iget v2, v0, Lc4/f;->b:I

    .line 612
    .line 613
    invoke-virtual {v0, v2}, Lc4/f;->a(I)V

    .line 614
    .line 615
    .line 616
    goto :goto_d

    .line 617
    :cond_15
    iget v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    .line 618
    .line 619
    const/4 v7, 0x2

    .line 620
    if-ne v3, v7, :cond_16

    .line 621
    .line 622
    iget v0, v0, Lc4/f;->b:I

    .line 623
    .line 624
    invoke-virtual {v2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    .line 625
    .line 626
    .line 627
    :cond_16
    :goto_d
    return-void

    .line 628
    :pswitch_c
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v0, Landroidx/room/q;

    .line 631
    .line 632
    iget-object v0, v0, Landroidx/room/q;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 633
    .line 634
    invoke-virtual {v0}, Landroidx/room/w;->getCloseLock$room_runtime_release()Ljava/util/concurrent/locks/Lock;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 639
    .line 640
    .line 641
    :try_start_3
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v0, Landroidx/room/q;

    .line 644
    .line 645
    invoke-virtual {v0}, Landroidx/room/q;->c()Z

    .line 646
    .line 647
    .line 648
    move-result v0
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 649
    if-nez v0, :cond_17

    .line 650
    .line 651
    :goto_e
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_15

    .line 655
    .line 656
    :cond_17
    :try_start_4
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v0, Landroidx/room/q;

    .line 659
    .line 660
    iget-object v0, v0, Landroidx/room/q;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 661
    .line 662
    const/4 v3, 0x0

    .line 663
    const/4 v8, 0x1

    .line 664
    invoke-virtual {v0, v8, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 665
    .line 666
    .line 667
    move-result v0

    .line 668
    if-nez v0, :cond_18

    .line 669
    .line 670
    goto :goto_e

    .line 671
    :cond_18
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, Landroidx/room/q;

    .line 674
    .line 675
    iget-object v0, v0, Landroidx/room/q;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 676
    .line 677
    invoke-virtual {v0}, Landroidx/room/w;->inTransaction()Z

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-eqz v0, :cond_19

    .line 682
    .line 683
    goto :goto_e

    .line 684
    :cond_19
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Landroidx/room/q;

    .line 687
    .line 688
    iget-object v0, v0, Landroidx/room/q;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 689
    .line 690
    invoke-virtual {v0}, Landroidx/room/w;->getOpenHelper()Lj2/d;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    check-cast v0, Lk2/g;

    .line 695
    .line 696
    invoke-virtual {v0}, Lk2/g;->a()Lj2/a;

    .line 697
    .line 698
    .line 699
    move-result-object v3

    .line 700
    invoke-interface {v3}, Lj2/a;->L()V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 701
    .line 702
    .line 703
    :try_start_5
    invoke-virtual {v1}, LA1/b;->a()Lo5/g;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-interface {v3}, Lj2/a;->J()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 708
    .line 709
    .line 710
    :try_start_6
    invoke-interface {v3}, Lj2/a;->g()V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 711
    .line 712
    .line 713
    :goto_f
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 714
    .line 715
    .line 716
    goto :goto_12

    .line 717
    :catchall_3
    move-exception v0

    .line 718
    goto :goto_16

    .line 719
    :catch_0
    move-exception v0

    .line 720
    goto :goto_10

    .line 721
    :catch_1
    move-exception v0

    .line 722
    goto :goto_11

    .line 723
    :catchall_4
    move-exception v0

    .line 724
    :try_start_7
    invoke-interface {v3}, Lj2/a;->g()V

    .line 725
    .line 726
    .line 727
    throw v0
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 728
    :goto_10
    :try_start_8
    const-string v3, "ROOM"

    .line 729
    .line 730
    const-string v4, "Cannot run invalidation tracker. Is the db closed?"

    .line 731
    .line 732
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 733
    .line 734
    .line 735
    sget-object v0, Ln5/u;->q:Ln5/u;

    .line 736
    .line 737
    goto :goto_f

    .line 738
    :goto_11
    const-string v3, "ROOM"

    .line 739
    .line 740
    const-string v4, "Cannot run invalidation tracker. Is the db closed?"

    .line 741
    .line 742
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 743
    .line 744
    .line 745
    sget-object v0, Ln5/u;->q:Ln5/u;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 746
    .line 747
    goto :goto_f

    .line 748
    :goto_12
    move-object v2, v0

    .line 749
    check-cast v2, Ljava/util/Collection;

    .line 750
    .line 751
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    if-nez v2, :cond_1b

    .line 756
    .line 757
    iget-object v2, v1, LA1/b;->r:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v2, Landroidx/room/q;

    .line 760
    .line 761
    iget-object v3, v2, Landroidx/room/q;->k:Lo/f;

    .line 762
    .line 763
    monitor-enter v3

    .line 764
    :try_start_9
    iget-object v2, v2, Landroidx/room/q;->k:Lo/f;

    .line 765
    .line 766
    invoke-virtual {v2}, Lo/f;->iterator()Ljava/util/Iterator;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    :goto_13
    move-object v4, v2

    .line 771
    check-cast v4, Lo/b;

    .line 772
    .line 773
    invoke-virtual {v4}, Lo/b;->hasNext()Z

    .line 774
    .line 775
    .line 776
    move-result v5

    .line 777
    if-eqz v5, :cond_1a

    .line 778
    .line 779
    invoke-virtual {v4}, Lo/b;->next()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    check-cast v4, Ljava/util/Map$Entry;

    .line 784
    .line 785
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    check-cast v4, Landroidx/room/o;

    .line 790
    .line 791
    invoke-virtual {v4, v0}, Landroidx/room/o;->a(Ljava/util/Set;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 792
    .line 793
    .line 794
    goto :goto_13

    .line 795
    :catchall_5
    move-exception v0

    .line 796
    goto :goto_14

    .line 797
    :cond_1a
    monitor-exit v3

    .line 798
    goto :goto_15

    .line 799
    :goto_14
    monitor-exit v3

    .line 800
    throw v0

    .line 801
    :cond_1b
    :goto_15
    return-void

    .line 802
    :goto_16
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 803
    .line 804
    .line 805
    throw v0

    .line 806
    :pswitch_d
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v0, LO3/t0;

    .line 809
    .line 810
    iget-object v2, v0, LO3/t0;->y:LO3/Y1;

    .line 811
    .line 812
    iget-object v3, v0, LO3/t0;->C:LO3/b1;

    .line 813
    .line 814
    invoke-static {v2}, LO3/t0;->j(LO3/D0;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v2}, LO3/D0;->o()V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v2}, LO3/Y1;->J()J

    .line 821
    .line 822
    .line 823
    move-result-wide v6

    .line 824
    const-wide/16 v8, 0x1

    .line 825
    .line 826
    cmp-long v2, v6, v8

    .line 827
    .line 828
    if-nez v2, :cond_1d

    .line 829
    .line 830
    invoke-static {v3}, LO3/t0;->k(LO3/H;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v3}, LO3/C;->o()V

    .line 834
    .line 835
    .line 836
    iget-object v0, v3, LO3/b1;->C:LO3/P0;

    .line 837
    .line 838
    if-eqz v0, :cond_1c

    .line 839
    .line 840
    invoke-virtual {v0}, LO3/o;->c()V

    .line 841
    .line 842
    .line 843
    :cond_1c
    new-instance v0, Ljava/lang/Thread;

    .line 844
    .line 845
    invoke-static {v3}, LO3/t0;->k(LO3/H;)V

    .line 846
    .line 847
    .line 848
    new-instance v2, LO3/O0;

    .line 849
    .line 850
    invoke-direct {v2, v3, v5}, LO3/O0;-><init>(LO3/b1;I)V

    .line 851
    .line 852
    .line 853
    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 857
    .line 858
    .line 859
    goto :goto_17

    .line 860
    :cond_1d
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 861
    .line 862
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 863
    .line 864
    .line 865
    iget-object v0, v0, LO3/X;->z:LO3/V;

    .line 866
    .line 867
    const-string v2, "registerTrigger called but app not eligible"

    .line 868
    .line 869
    invoke-virtual {v0, v2}, LO3/V;->b(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    :goto_17
    return-void

    .line 873
    :pswitch_e
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v0, LO3/b2;

    .line 876
    .line 877
    iget-object v0, v0, LO3/b2;->a:LO3/t0;

    .line 878
    .line 879
    iget-object v2, v0, LO3/t0;->K:LO3/g1;

    .line 880
    .line 881
    invoke-static {v2}, LO3/t0;->i(LO3/C;)V

    .line 882
    .line 883
    .line 884
    iget-object v0, v0, LO3/t0;->K:LO3/g1;

    .line 885
    .line 886
    sget-object v2, LO3/F;->D:LO3/E;

    .line 887
    .line 888
    invoke-virtual {v2, v8}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    check-cast v2, Ljava/lang/Long;

    .line 893
    .line 894
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 895
    .line 896
    .line 897
    move-result-wide v2

    .line 898
    invoke-virtual {v0, v2, v3}, LO3/g1;->s(J)V

    .line 899
    .line 900
    .line 901
    return-void

    .line 902
    :pswitch_f
    const-wide/16 v17, 0x0

    .line 903
    .line 904
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v0, LO3/T1;

    .line 907
    .line 908
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    invoke-virtual {v2}, LO3/p0;->o()V

    .line 913
    .line 914
    .line 915
    new-instance v2, LO3/j0;

    .line 916
    .line 917
    invoke-direct {v2, v0}, LO3/j0;-><init>(LO3/T1;)V

    .line 918
    .line 919
    .line 920
    iput-object v2, v0, LO3/T1;->A:LO3/j0;

    .line 921
    .line 922
    new-instance v2, LO3/n;

    .line 923
    .line 924
    invoke-direct {v2, v0}, LO3/n;-><init>(LO3/T1;)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v2}, LO3/O1;->q()V

    .line 928
    .line 929
    .line 930
    iput-object v2, v0, LO3/T1;->s:LO3/n;

    .line 931
    .line 932
    iget-object v2, v0, LO3/T1;->q:LO3/l0;

    .line 933
    .line 934
    invoke-virtual {v0}, LO3/T1;->d0()LO3/g;

    .line 935
    .line 936
    .line 937
    move-result-object v3

    .line 938
    invoke-static {v2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 939
    .line 940
    .line 941
    iput-object v2, v3, LO3/g;->u:LO3/f;

    .line 942
    .line 943
    new-instance v2, LO3/y1;

    .line 944
    .line 945
    invoke-direct {v2, v0}, LO3/y1;-><init>(LO3/T1;)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v2}, LO3/O1;->q()V

    .line 949
    .line 950
    .line 951
    iput-object v2, v0, LO3/T1;->y:LO3/y1;

    .line 952
    .line 953
    new-instance v2, LO3/c;

    .line 954
    .line 955
    invoke-direct {v2, v0}, LO3/O1;-><init>(LO3/T1;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v2}, LO3/O1;->q()V

    .line 959
    .line 960
    .line 961
    iput-object v2, v0, LO3/T1;->v:LO3/c;

    .line 962
    .line 963
    new-instance v2, LO3/b0;

    .line 964
    .line 965
    const/4 v3, 0x1

    .line 966
    invoke-direct {v2, v0, v3}, LO3/b0;-><init>(LO3/T1;I)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v2}, LO3/O1;->q()V

    .line 970
    .line 971
    .line 972
    iput-object v2, v0, LO3/T1;->x:LO3/b0;

    .line 973
    .line 974
    new-instance v2, LO3/J1;

    .line 975
    .line 976
    invoke-direct {v2, v0}, LO3/J1;-><init>(LO3/T1;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v2}, LO3/O1;->q()V

    .line 980
    .line 981
    .line 982
    iput-object v2, v0, LO3/T1;->u:LO3/J1;

    .line 983
    .line 984
    new-instance v2, LO3/d0;

    .line 985
    .line 986
    invoke-direct {v2, v0}, LO3/d0;-><init>(LO3/T1;)V

    .line 987
    .line 988
    .line 989
    iput-object v2, v0, LO3/T1;->t:LO3/d0;

    .line 990
    .line 991
    iget v2, v0, LO3/T1;->H:I

    .line 992
    .line 993
    iget v3, v0, LO3/T1;->I:I

    .line 994
    .line 995
    if-eq v2, v3, :cond_1e

    .line 996
    .line 997
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 1002
    .line 1003
    iget v3, v0, LO3/T1;->H:I

    .line 1004
    .line 1005
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    iget v4, v0, LO3/T1;->I:I

    .line 1010
    .line 1011
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v4

    .line 1015
    const-string v5, "Not all upload components initialized"

    .line 1016
    .line 1017
    invoke-virtual {v2, v3, v4, v5}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    :cond_1e
    iget-object v2, v0, LO3/T1;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1021
    .line 1022
    const/4 v3, 0x1

    .line 1023
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    iget-object v2, v2, LO3/X;->E:LO3/V;

    .line 1031
    .line 1032
    const-string v3, "UploadController is now fully initialized"

    .line 1033
    .line 1034
    invoke-virtual {v2, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v2

    .line 1041
    invoke-virtual {v2}, LO3/p0;->o()V

    .line 1042
    .line 1043
    .line 1044
    iget-object v2, v0, LO3/T1;->s:LO3/n;

    .line 1045
    .line 1046
    invoke-static {v2}, LO3/T1;->S(LO3/O1;)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v2}, LO3/n;->y()V

    .line 1050
    .line 1051
    .line 1052
    iget-object v2, v0, LO3/T1;->s:LO3/n;

    .line 1053
    .line 1054
    invoke-static {v2}, LO3/T1;->S(LO3/O1;)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v2}, LO3/D0;->o()V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v2}, LO3/O1;->p()V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v2}, LO3/n;->Z()Z

    .line 1064
    .line 1065
    .line 1066
    move-result v3

    .line 1067
    if-eqz v3, :cond_20

    .line 1068
    .line 1069
    sget-object v3, LO3/F;->v0:LO3/E;

    .line 1070
    .line 1071
    invoke-virtual {v3, v8}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v4

    .line 1075
    check-cast v4, Ljava/lang/Long;

    .line 1076
    .line 1077
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 1078
    .line 1079
    .line 1080
    move-result-wide v4

    .line 1081
    cmp-long v4, v4, v17

    .line 1082
    .line 1083
    if-nez v4, :cond_1f

    .line 1084
    .line 1085
    goto :goto_18

    .line 1086
    :cond_1f
    invoke-virtual {v2}, LO3/n;->f0()Landroid/database/sqlite/SQLiteDatabase;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v4

    .line 1090
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v2, LO3/t0;

    .line 1093
    .line 1094
    iget-object v5, v2, LO3/t0;->A:LB3/a;

    .line 1095
    .line 1096
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1100
    .line 1101
    .line 1102
    move-result-wide v5

    .line 1103
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v5

    .line 1107
    invoke-virtual {v3, v8}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v3

    .line 1111
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v3

    .line 1115
    filled-new-array {v5, v3}, [Ljava/lang/String;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v3

    .line 1119
    const-string v5, "trigger_uris"

    .line 1120
    .line 1121
    const-string v6, "abs(timestamp_millis - ?) > cast(? as integer)"

    .line 1122
    .line 1123
    invoke-virtual {v4, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1124
    .line 1125
    .line 1126
    move-result v3

    .line 1127
    if-lez v3, :cond_20

    .line 1128
    .line 1129
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 1130
    .line 1131
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 1132
    .line 1133
    .line 1134
    iget-object v2, v2, LO3/X;->E:LO3/V;

    .line 1135
    .line 1136
    const-string v4, "Deleted stale trigger uris. rowsDeleted"

    .line 1137
    .line 1138
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v3

    .line 1142
    invoke-virtual {v2, v3, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1143
    .line 1144
    .line 1145
    :cond_20
    :goto_18
    iget-object v2, v0, LO3/T1;->y:LO3/y1;

    .line 1146
    .line 1147
    iget-object v2, v2, LO3/y1;->y:LO3/f0;

    .line 1148
    .line 1149
    invoke-virtual {v2}, LO3/f0;->a()J

    .line 1150
    .line 1151
    .line 1152
    move-result-wide v2

    .line 1153
    cmp-long v2, v2, v17

    .line 1154
    .line 1155
    if-nez v2, :cond_21

    .line 1156
    .line 1157
    iget-object v2, v0, LO3/T1;->y:LO3/y1;

    .line 1158
    .line 1159
    iget-object v2, v2, LO3/y1;->y:LO3/f0;

    .line 1160
    .line 1161
    invoke-virtual {v0}, LO3/T1;->e()LB3/a;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    .line 1167
    .line 1168
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v3

    .line 1172
    invoke-virtual {v2, v3, v4}, LO3/f0;->b(J)V

    .line 1173
    .line 1174
    .line 1175
    :cond_21
    invoke-virtual {v0}, LO3/T1;->L()V

    .line 1176
    .line 1177
    .line 1178
    return-void

    .line 1179
    :pswitch_10
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1180
    .line 1181
    check-cast v0, LO3/B1;

    .line 1182
    .line 1183
    iget-object v2, v0, LO3/B1;->s:LB0/o;

    .line 1184
    .line 1185
    iget-object v2, v2, LB0/o;->r:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v2, LO3/E1;

    .line 1188
    .line 1189
    invoke-virtual {v2}, LO3/C;->o()V

    .line 1190
    .line 1191
    .line 1192
    iget-object v3, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 1193
    .line 1194
    check-cast v3, LO3/t0;

    .line 1195
    .line 1196
    iget-object v4, v3, LO3/t0;->v:LO3/X;

    .line 1197
    .line 1198
    iget-object v5, v3, LO3/t0;->q:Landroid/content/Context;

    .line 1199
    .line 1200
    invoke-static {v4}, LO3/t0;->l(LO3/E0;)V

    .line 1201
    .line 1202
    .line 1203
    iget-object v6, v4, LO3/X;->D:LO3/V;

    .line 1204
    .line 1205
    const-string v7, "Application going to the background"

    .line 1206
    .line 1207
    invoke-virtual {v6, v7}, LO3/V;->b(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    iget-object v6, v3, LO3/t0;->u:LO3/h0;

    .line 1211
    .line 1212
    invoke-static {v6}, LO3/t0;->j(LO3/D0;)V

    .line 1213
    .line 1214
    .line 1215
    iget-object v6, v6, LO3/h0;->J:LO3/e0;

    .line 1216
    .line 1217
    const/4 v7, 0x1

    .line 1218
    invoke-virtual {v6, v7}, LO3/e0;->e(Z)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v2}, LO3/C;->o()V

    .line 1222
    .line 1223
    .line 1224
    iput-boolean v7, v2, LO3/E1;->u:Z

    .line 1225
    .line 1226
    iget-object v6, v3, LO3/t0;->t:LO3/g;

    .line 1227
    .line 1228
    invoke-virtual {v6}, LO3/g;->C()Z

    .line 1229
    .line 1230
    .line 1231
    move-result v7

    .line 1232
    if-nez v7, :cond_22

    .line 1233
    .line 1234
    iget-wide v9, v0, LO3/B1;->r:J

    .line 1235
    .line 1236
    iget-object v2, v2, LO3/E1;->w:LO3/D1;

    .line 1237
    .line 1238
    const/4 v7, 0x0

    .line 1239
    invoke-virtual {v2, v7, v7, v9, v10}, LO3/D1;->e(ZZJ)Z

    .line 1240
    .line 1241
    .line 1242
    iget-object v2, v2, LO3/D1;->c:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v2, LO3/C1;

    .line 1245
    .line 1246
    invoke-virtual {v2}, LO3/o;->c()V

    .line 1247
    .line 1248
    .line 1249
    :cond_22
    iget-wide v9, v0, LO3/B1;->q:J

    .line 1250
    .line 1251
    invoke-static {v4}, LO3/t0;->l(LO3/E0;)V

    .line 1252
    .line 1253
    .line 1254
    iget-object v0, v4, LO3/X;->C:LO3/V;

    .line 1255
    .line 1256
    const-string v2, "Application backgrounded at: timestamp_millis"

    .line 1257
    .line 1258
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v7

    .line 1262
    invoke-virtual {v0, v7, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1263
    .line 1264
    .line 1265
    iget-object v0, v3, LO3/t0;->C:LO3/b1;

    .line 1266
    .line 1267
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v0}, LO3/C;->o()V

    .line 1271
    .line 1272
    .line 1273
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 1274
    .line 1275
    check-cast v2, LO3/t0;

    .line 1276
    .line 1277
    invoke-virtual {v0}, LO3/H;->p()V

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v2}, LO3/t0;->o()LO3/w1;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v0

    .line 1284
    invoke-virtual {v0}, LO3/C;->o()V

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v0}, LO3/H;->p()V

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v0}, LO3/w1;->v()Z

    .line 1291
    .line 1292
    .line 1293
    move-result v7

    .line 1294
    if-nez v7, :cond_23

    .line 1295
    .line 1296
    goto :goto_19

    .line 1297
    :cond_23
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 1298
    .line 1299
    check-cast v0, LO3/t0;

    .line 1300
    .line 1301
    iget-object v0, v0, LO3/t0;->y:LO3/Y1;

    .line 1302
    .line 1303
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v0}, LO3/Y1;->U()I

    .line 1307
    .line 1308
    .line 1309
    move-result v0

    .line 1310
    const v7, 0x3b3a8

    .line 1311
    .line 1312
    .line 1313
    if-lt v0, v7, :cond_24

    .line 1314
    .line 1315
    :goto_19
    invoke-virtual {v2}, LO3/t0;->o()LO3/w1;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    invoke-virtual {v0}, LO3/C;->o()V

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v0}, LO3/H;->p()V

    .line 1323
    .line 1324
    .line 1325
    const/4 v7, 0x1

    .line 1326
    invoke-virtual {v0, v7}, LO3/w1;->E(Z)LO3/a2;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    new-instance v7, LO3/r1;

    .line 1331
    .line 1332
    const/4 v9, 0x2

    .line 1333
    invoke-direct {v7, v0, v2, v9}, LO3/r1;-><init>(LO3/w1;LO3/a2;I)V

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v0, v7}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 1337
    .line 1338
    .line 1339
    :cond_24
    sget-object v0, LO3/F;->N0:LO3/E;

    .line 1340
    .line 1341
    invoke-virtual {v6, v8, v0}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v0

    .line 1345
    if-eqz v0, :cond_26

    .line 1346
    .line 1347
    iget-object v0, v3, LO3/t0;->y:LO3/Y1;

    .line 1348
    .line 1349
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v2

    .line 1356
    iget-object v7, v6, LO3/g;->t:Ljava/lang/String;

    .line 1357
    .line 1358
    invoke-virtual {v0, v2, v7}, LO3/Y1;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v0

    .line 1362
    if-eqz v0, :cond_25

    .line 1363
    .line 1364
    const-wide/16 v5, 0x3e8

    .line 1365
    .line 1366
    goto :goto_1a

    .line 1367
    :cond_25
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    sget-object v2, LO3/F;->E:LO3/E;

    .line 1372
    .line 1373
    invoke-virtual {v6, v0, v2}, LO3/g;->v(Ljava/lang/String;LO3/E;)J

    .line 1374
    .line 1375
    .line 1376
    move-result-wide v5

    .line 1377
    :goto_1a
    invoke-static {v4}, LO3/t0;->l(LO3/E0;)V

    .line 1378
    .line 1379
    .line 1380
    iget-object v0, v4, LO3/X;->E:LO3/V;

    .line 1381
    .line 1382
    const-string v2, "[sgtm] Scheduling batch upload with minimum latency in millis"

    .line 1383
    .line 1384
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v4

    .line 1388
    invoke-virtual {v0, v4, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1389
    .line 1390
    .line 1391
    iget-object v0, v3, LO3/t0;->K:LO3/g1;

    .line 1392
    .line 1393
    invoke-static {v0}, LO3/t0;->i(LO3/C;)V

    .line 1394
    .line 1395
    .line 1396
    iget-object v0, v3, LO3/t0;->K:LO3/g1;

    .line 1397
    .line 1398
    invoke-virtual {v0, v5, v6}, LO3/g1;->s(J)V

    .line 1399
    .line 1400
    .line 1401
    :cond_26
    return-void

    .line 1402
    :pswitch_11
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v0, LI4/a;

    .line 1405
    .line 1406
    iget-object v0, v0, LI4/a;->s:Ljava/lang/Object;

    .line 1407
    .line 1408
    check-cast v0, LO3/v1;

    .line 1409
    .line 1410
    iget-object v0, v0, LO3/v1;->s:LO3/w1;

    .line 1411
    .line 1412
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 1413
    .line 1414
    check-cast v2, LO3/t0;

    .line 1415
    .line 1416
    iget-object v2, v2, LO3/t0;->w:LO3/p0;

    .line 1417
    .line 1418
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 1419
    .line 1420
    .line 1421
    new-instance v3, LO3/u1;

    .line 1422
    .line 1423
    const/4 v8, 0x0

    .line 1424
    invoke-direct {v3, v0, v8}, LO3/u1;-><init>(LO3/w1;I)V

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v2, v3}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 1428
    .line 1429
    .line 1430
    return-void

    .line 1431
    :pswitch_12
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1432
    .line 1433
    check-cast v0, LO3/v1;

    .line 1434
    .line 1435
    iget-object v0, v0, LO3/v1;->s:LO3/w1;

    .line 1436
    .line 1437
    new-instance v2, Landroid/content/ComponentName;

    .line 1438
    .line 1439
    iget-object v3, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 1440
    .line 1441
    check-cast v3, LO3/t0;

    .line 1442
    .line 1443
    iget-object v3, v3, LO3/t0;->q:Landroid/content/Context;

    .line 1444
    .line 1445
    const-string v4, "com.google.android.gms.measurement.AppMeasurementService"

    .line 1446
    .line 1447
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v0, v2}, LO3/w1;->z(Landroid/content/ComponentName;)V

    .line 1451
    .line 1452
    .line 1453
    return-void

    .line 1454
    :pswitch_13
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1455
    .line 1456
    check-cast v0, LO3/d0;

    .line 1457
    .line 1458
    iget-object v0, v0, LO3/d0;->a:LO3/T1;

    .line 1459
    .line 1460
    invoke-virtual {v0}, LO3/T1;->L()V

    .line 1461
    .line 1462
    .line 1463
    return-void

    .line 1464
    :pswitch_14
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1465
    .line 1466
    check-cast v0, LJ1/H;

    .line 1467
    .line 1468
    const/4 v8, 0x1

    .line 1469
    invoke-virtual {v0, v8}, LJ1/H;->y(Z)Z

    .line 1470
    .line 1471
    .line 1472
    return-void

    .line 1473
    :pswitch_15
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1474
    .line 1475
    check-cast v0, LJ1/m;

    .line 1476
    .line 1477
    iget-object v2, v0, LJ1/m;->l0:LJ1/j;

    .line 1478
    .line 1479
    iget-object v0, v0, LJ1/m;->t0:Landroid/app/Dialog;

    .line 1480
    .line 1481
    invoke-virtual {v2, v0}, LJ1/j;->onDismiss(Landroid/content/DialogInterface;)V

    .line 1482
    .line 1483
    .line 1484
    return-void

    .line 1485
    :pswitch_16
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1486
    .line 1487
    check-cast v0, LJ1/e;

    .line 1488
    .line 1489
    iget-object v2, v0, LJ1/e;->b:Landroid/view/ViewGroup;

    .line 1490
    .line 1491
    iget-object v3, v0, LJ1/e;->c:Landroid/view/View;

    .line 1492
    .line 1493
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 1494
    .line 1495
    .line 1496
    iget-object v0, v0, LJ1/e;->d:LJ1/f;

    .line 1497
    .line 1498
    invoke-virtual {v0}, LC0/b;->d()V

    .line 1499
    .line 1500
    .line 1501
    return-void

    .line 1502
    :pswitch_17
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v0, LD1/d;

    .line 1505
    .line 1506
    const/4 v8, 0x0

    .line 1507
    invoke-virtual {v0, v8}, LD1/d;->n(I)V

    .line 1508
    .line 1509
    .line 1510
    return-void

    .line 1511
    :pswitch_18
    move v8, v11

    .line 1512
    const/4 v9, 0x2

    .line 1513
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1514
    .line 1515
    check-cast v0, LC0/A;

    .line 1516
    .line 1517
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1518
    .line 1519
    .line 1520
    iget-object v11, v0, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 1521
    .line 1522
    if-eqz v11, :cond_2a

    .line 1523
    .line 1524
    invoke-virtual {v11, v8}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 1525
    .line 1526
    .line 1527
    move-result v0

    .line 1528
    if-ne v0, v5, :cond_27

    .line 1529
    .line 1530
    const/16 v21, 0x1

    .line 1531
    .line 1532
    goto :goto_1b

    .line 1533
    :cond_27
    const/16 v21, 0x0

    .line 1534
    .line 1535
    :goto_1b
    invoke-virtual {v11}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1536
    .line 1537
    .line 1538
    move-result v0

    .line 1539
    if-eqz v21, :cond_28

    .line 1540
    .line 1541
    const/16 v2, 0xa

    .line 1542
    .line 1543
    if-eq v0, v2, :cond_2a

    .line 1544
    .line 1545
    const/4 v8, 0x1

    .line 1546
    if-eq v0, v8, :cond_2a

    .line 1547
    .line 1548
    goto :goto_1c

    .line 1549
    :cond_28
    const/4 v8, 0x1

    .line 1550
    if-eq v0, v8, :cond_2a

    .line 1551
    .line 1552
    :goto_1c
    const/4 v2, 0x7

    .line 1553
    if-eq v0, v2, :cond_29

    .line 1554
    .line 1555
    const/16 v3, 0x9

    .line 1556
    .line 1557
    if-eq v0, v3, :cond_29

    .line 1558
    .line 1559
    move v12, v9

    .line 1560
    goto :goto_1d

    .line 1561
    :cond_29
    move v12, v2

    .line 1562
    :goto_1d
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1563
    .line 1564
    move-object v10, v0

    .line 1565
    check-cast v10, LC0/A;

    .line 1566
    .line 1567
    iget-wide v13, v10, LC0/A;->H0:J

    .line 1568
    .line 1569
    const/4 v15, 0x0

    .line 1570
    invoke-virtual/range {v10 .. v15}, LC0/A;->O(Landroid/view/MotionEvent;IJZ)V

    .line 1571
    .line 1572
    .line 1573
    :cond_2a
    return-void

    .line 1574
    :pswitch_19
    const-wide/16 v17, 0x0

    .line 1575
    .line 1576
    iget-object v0, v1, LA1/b;->r:Ljava/lang/Object;

    .line 1577
    .line 1578
    check-cast v0, LA1/e;

    .line 1579
    .line 1580
    iget-object v2, v0, LA1/e;->s:Lm/p0;

    .line 1581
    .line 1582
    iget-object v5, v0, LA1/e;->q:LA1/a;

    .line 1583
    .line 1584
    iget-boolean v6, v0, LA1/e;->E:Z

    .line 1585
    .line 1586
    if-nez v6, :cond_2b

    .line 1587
    .line 1588
    goto/16 :goto_20

    .line 1589
    .line 1590
    :cond_2b
    iget-boolean v6, v0, LA1/e;->C:Z

    .line 1591
    .line 1592
    if-eqz v6, :cond_2c

    .line 1593
    .line 1594
    const/4 v8, 0x0

    .line 1595
    iput-boolean v8, v0, LA1/e;->C:Z

    .line 1596
    .line 1597
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1598
    .line 1599
    .line 1600
    move-result-wide v6

    .line 1601
    iput-wide v6, v5, LA1/a;->e:J

    .line 1602
    .line 1603
    iput-wide v3, v5, LA1/a;->g:J

    .line 1604
    .line 1605
    iput-wide v6, v5, LA1/a;->f:J

    .line 1606
    .line 1607
    const/high16 v3, 0x3f000000    # 0.5f

    .line 1608
    .line 1609
    iput v3, v5, LA1/a;->h:F

    .line 1610
    .line 1611
    :cond_2c
    iget-wide v3, v5, LA1/a;->g:J

    .line 1612
    .line 1613
    cmp-long v3, v3, v17

    .line 1614
    .line 1615
    if-lez v3, :cond_2d

    .line 1616
    .line 1617
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1618
    .line 1619
    .line 1620
    move-result-wide v3

    .line 1621
    iget-wide v6, v5, LA1/a;->g:J

    .line 1622
    .line 1623
    iget v8, v5, LA1/a;->i:I

    .line 1624
    .line 1625
    int-to-long v8, v8

    .line 1626
    add-long/2addr v6, v8

    .line 1627
    cmp-long v3, v3, v6

    .line 1628
    .line 1629
    if-lez v3, :cond_2d

    .line 1630
    .line 1631
    :goto_1e
    const/4 v8, 0x0

    .line 1632
    goto :goto_1f

    .line 1633
    :cond_2d
    invoke-virtual {v0}, LA1/e;->e()Z

    .line 1634
    .line 1635
    .line 1636
    move-result v3

    .line 1637
    if-nez v3, :cond_2e

    .line 1638
    .line 1639
    goto :goto_1e

    .line 1640
    :goto_1f
    iput-boolean v8, v0, LA1/e;->E:Z

    .line 1641
    .line 1642
    goto :goto_20

    .line 1643
    :cond_2e
    const/4 v8, 0x0

    .line 1644
    iget-boolean v3, v0, LA1/e;->D:Z

    .line 1645
    .line 1646
    if-eqz v3, :cond_2f

    .line 1647
    .line 1648
    iput-boolean v8, v0, LA1/e;->D:Z

    .line 1649
    .line 1650
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1651
    .line 1652
    .line 1653
    move-result-wide v9

    .line 1654
    const/4 v15, 0x0

    .line 1655
    const/16 v16, 0x0

    .line 1656
    .line 1657
    const/4 v13, 0x3

    .line 1658
    const/4 v14, 0x0

    .line 1659
    move-wide v11, v9

    .line 1660
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v3

    .line 1664
    invoke-virtual {v2, v3}, Lm/p0;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 1668
    .line 1669
    .line 1670
    :cond_2f
    iget-wide v3, v5, LA1/a;->f:J

    .line 1671
    .line 1672
    cmp-long v3, v3, v17

    .line 1673
    .line 1674
    if-eqz v3, :cond_30

    .line 1675
    .line 1676
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1677
    .line 1678
    .line 1679
    move-result-wide v3

    .line 1680
    invoke-virtual {v5, v3, v4}, LA1/a;->a(J)F

    .line 1681
    .line 1682
    .line 1683
    move-result v6

    .line 1684
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1685
    .line 1686
    mul-float/2addr v7, v6

    .line 1687
    mul-float/2addr v7, v6

    .line 1688
    const/high16 v8, 0x40800000    # 4.0f

    .line 1689
    .line 1690
    mul-float/2addr v6, v8

    .line 1691
    add-float/2addr v6, v7

    .line 1692
    iget-wide v7, v5, LA1/a;->f:J

    .line 1693
    .line 1694
    sub-long v7, v3, v7

    .line 1695
    .line 1696
    iput-wide v3, v5, LA1/a;->f:J

    .line 1697
    .line 1698
    long-to-float v3, v7

    .line 1699
    mul-float/2addr v3, v6

    .line 1700
    iget v4, v5, LA1/a;->d:F

    .line 1701
    .line 1702
    mul-float/2addr v3, v4

    .line 1703
    float-to-int v3, v3

    .line 1704
    iget-object v0, v0, LA1/e;->G:Lm/p0;

    .line 1705
    .line 1706
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1707
    .line 1708
    .line 1709
    sget-object v0, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 1710
    .line 1711
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1712
    .line 1713
    .line 1714
    :goto_20
    return-void

    .line 1715
    :cond_30
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1716
    .line 1717
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 1718
    .line 1719
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1720
    .line 1721
    .line 1722
    throw v0

    .line 1723
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
