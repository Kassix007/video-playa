.class public final LC0/A;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements LB0/t0;
.implements LB0/z0;
.implements Landroidx/lifecycle/f;


# static fields
.field public static S0:Ljava/lang/Class;

.field public static T0:Ljava/lang/reflect/Method;


# instance fields
.field public final A:LB0/L;

.field public A0:I

.field public final B:Lr/v;

.field public final B0:LP/f0;

.field public final C:LJ0/a;

.field public final C0:Lr0/b;

.field public final D:LC0/A;

.field public final D0:Ls0/c;

.field public final E:LI0/n;

.field public final E0:LA0/e;

.field public final F:LC0/I;

.field public final F0:LC0/E0;

.field public G:Le0/c;

.field public G0:Landroid/view/MotionEvent;

.field public final H:LC0/g;

.field public H0:J

.field public final I:Lj0/d;

.field public final I0:LB0/o;

.field public final J:Ld0/h;

.field public final J0:Lr/C;

.field public final K:Ljava/util/ArrayList;

.field public final K0:LA1/b;

.field public L:Ljava/util/ArrayList;

.field public final L0:LC0/m;

.field public M:Z

.field public M0:Z

.field public N:Z

.field public final N0:LC0/y;

.field public final O:Lv0/c;

.field public final O0:LC0/m0;

.field public final P:LL/s;

.field public P0:Z

.field public Q:LB5/c;

.field public final Q0:LC0/I0;

.field public final R:LE/c0;

.field public final R0:LC0/E0;

.field public final S:Ld0/b;

.field public T:Z

.field public final U:LC0/i;

.field public final V:LC0/h;

.field public final W:LB0/v0;

.field public a0:Z

.field public b0:LC0/k0;

.field public c0:LC0/z0;

.field public d0:LW0/a;

.field public e0:Z

.field public final f0:LB0/a0;

.field public g0:J

.field public final h0:[I

.field public final i0:[F

.field public final j0:[F

.field public k0:J

.field public l0:Z

.field public m0:J

.field public n0:Z

.field public final o0:LP/f0;

.field public final p0:LP/C;

.field public q:J

.field public q0:LB5/c;

.field public final r:Z

.field public final r0:LC0/j;

.field public final s:LB0/N;

.field public final s0:LC0/k;

.field public final t:LP/f0;

.field public final t0:LC0/l;

.field public final u:Lh0/h;

.field public final u0:LP0/c;

.field public v:Lq5/h;

.field public final v0:LP0/e;

.field public final w:Lf0/a;

.field public final w0:Ljava/util/concurrent/atomic/AtomicReference;

.field public final x:LC0/I0;

.field public final x0:LC0/E0;

.field public final y:Lj0/n;

.field public final y0:LC0/E0;

.field public final z:LC0/j0;

.field public final z0:LP/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lq5/h;)V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, v2, LC0/A;->q:J

    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    iput-boolean v9, v2, LC0/A;->r:Z

    .line 17
    .line 18
    new-instance v0, LB0/N;

    .line 19
    .line 20
    invoke-direct {v0}, LB0/N;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, v2, LC0/A;->s:LB0/N;

    .line 24
    .line 25
    invoke-static {v8}, LQ2/g;->a(Landroid/content/Context;)LW0/e;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v10, LP/S;->t:LP/S;

    .line 30
    .line 31
    new-instance v1, LP/f0;

    .line 32
    .line 33
    invoke-direct {v1, v0, v10}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, v2, LC0/A;->t:LP/f0;

    .line 37
    .line 38
    new-instance v11, LI0/d;

    .line 39
    .line 40
    invoke-direct {v11}, Lc0/l;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v12, Landroidx/compose/ui/semantics/EmptySemanticsElement;

    .line 44
    .line 45
    invoke-direct {v12, v11}, Landroidx/compose/ui/semantics/EmptySemanticsElement;-><init>(LI0/d;)V

    .line 46
    .line 47
    .line 48
    new-instance v13, Landroidx/compose/ui/platform/AndroidComposeView$bringIntoViewNode$1;

    .line 49
    .line 50
    invoke-direct {v13, v2}, Landroidx/compose/ui/platform/AndroidComposeView$bringIntoViewNode$1;-><init>(LC0/A;)V

    .line 51
    .line 52
    .line 53
    new-instance v14, Lh0/h;

    .line 54
    .line 55
    new-instance v0, LC0/s;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v1, 0x1

    .line 60
    const-class v3, LC0/A;

    .line 61
    .line 62
    const-string v4, "registerOnEndApplyChangesListener"

    .line 63
    .line 64
    const-string v5, "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V"

    .line 65
    .line 66
    invoke-direct/range {v0 .. v7}, LC0/s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    move-object v15, v0

    .line 70
    new-instance v0, LC0/t;

    .line 71
    .line 72
    const/4 v1, 0x2

    .line 73
    const-class v3, LC0/A;

    .line 74
    .line 75
    const-string v4, "onRequestFocusForOwner"

    .line 76
    .line 77
    const-string v5, "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z"

    .line 78
    .line 79
    invoke-direct/range {v0 .. v7}, LC0/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 80
    .line 81
    .line 82
    new-instance v1, LC0/s;

    .line 83
    .line 84
    move-object v1, v0

    .line 85
    new-instance v0, LC0/q;

    .line 86
    .line 87
    const/4 v7, 0x1

    .line 88
    move-object v2, v1

    .line 89
    const/4 v1, 0x0

    .line 90
    const-class v3, LC0/A;

    .line 91
    .line 92
    const-string v4, "onClearFocusForOwner"

    .line 93
    .line 94
    const-string v5, "onClearFocusForOwner()V"

    .line 95
    .line 96
    move-object v9, v2

    .line 97
    move-object/from16 v2, p0

    .line 98
    .line 99
    invoke-direct/range {v0 .. v7}, LC0/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 100
    .line 101
    .line 102
    move-object v7, v0

    .line 103
    new-instance v0, LC0/q;

    .line 104
    .line 105
    new-instance v0, LC0/u;

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    const-class v3, LC0/A;

    .line 109
    .line 110
    const-string v5, "layoutDirection"

    .line 111
    .line 112
    const-string v6, "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"

    .line 113
    .line 114
    move-object/from16 v4, p0

    .line 115
    .line 116
    invoke-direct/range {v0 .. v6}, LC0/u;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    move-object v2, v4

    .line 120
    invoke-direct {v14, v15, v9, v7, v0}, Lh0/h;-><init>(LC0/s;LC0/t;LC0/q;LC0/u;)V

    .line 121
    .line 122
    .line 123
    iput-object v14, v2, LC0/A;->u:Lh0/h;

    .line 124
    .line 125
    move-object/from16 v0, p2

    .line 126
    .line 127
    iput-object v0, v2, LC0/A;->v:Lq5/h;

    .line 128
    .line 129
    new-instance v0, Lf0/a;

    .line 130
    .line 131
    new-instance v1, LC0/r;

    .line 132
    .line 133
    invoke-direct {v0}, Lf0/a;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v0, v2, LC0/A;->w:Lf0/a;

    .line 137
    .line 138
    new-instance v0, LC0/I0;

    .line 139
    .line 140
    const/4 v9, 0x0

    .line 141
    invoke-direct {v0, v9}, LC0/I0;-><init>(I)V

    .line 142
    .line 143
    .line 144
    iput-object v0, v2, LC0/A;->x:LC0/I0;

    .line 145
    .line 146
    new-instance v0, LC0/x;

    .line 147
    .line 148
    invoke-direct {v0, v2, v9}, LC0/x;-><init>(LC0/A;I)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0}, Landroidx/compose/ui/input/key/a;->a(LC0/x;)Lc0/m;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {}, Landroidx/compose/ui/input/rotary/a;->a()Lc0/m;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    new-instance v3, Lj0/n;

    .line 160
    .line 161
    invoke-direct {v3}, Lj0/n;-><init>()V

    .line 162
    .line 163
    .line 164
    iput-object v3, v2, LC0/A;->y:Lj0/n;

    .line 165
    .line 166
    new-instance v3, LC0/j0;

    .line 167
    .line 168
    invoke-static {v8}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-direct {v3, v4}, LC0/j0;-><init>(Landroid/view/ViewConfiguration;)V

    .line 173
    .line 174
    .line 175
    iput-object v3, v2, LC0/A;->z:LC0/j0;

    .line 176
    .line 177
    new-instance v3, LB0/L;

    .line 178
    .line 179
    const/4 v4, 0x3

    .line 180
    invoke-direct {v3, v4}, LB0/L;-><init>(I)V

    .line 181
    .line 182
    .line 183
    sget-object v4, Lz0/M;->a:Lz0/M;

    .line 184
    .line 185
    invoke-virtual {v3, v4}, LB0/L;->X(Lz0/C;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, LC0/A;->getDensity()LW0/c;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v3, v4}, LB0/L;->V(LW0/c;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, LC0/A;->getViewConfiguration()LC0/b1;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v3, v4}, LB0/L;->Z(LC0/b1;)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v12, v1}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-interface {v1, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v2}, LC0/A;->getFocusOwner()Lh0/g;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Lh0/h;

    .line 215
    .line 216
    iget-object v1, v1, Lh0/h;->g:Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    .line 217
    .line 218
    invoke-interface {v0, v1}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v2}, LC0/A;->getDragAndDropManager()Lf0/a;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    iget-object v1, v1, Lf0/a;->c:Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    .line 227
    .line 228
    invoke-interface {v0, v1}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v0, v13}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v3, v0}, LB0/L;->Y(Lc0/m;)V

    .line 237
    .line 238
    .line 239
    iput-object v3, v2, LC0/A;->A:LB0/L;

    .line 240
    .line 241
    sget-object v0, Lr/l;->a:Lr/v;

    .line 242
    .line 243
    new-instance v0, Lr/v;

    .line 244
    .line 245
    invoke-direct {v0}, Lr/v;-><init>()V

    .line 246
    .line 247
    .line 248
    iput-object v0, v2, LC0/A;->B:Lr/v;

    .line 249
    .line 250
    new-instance v0, LJ0/a;

    .line 251
    .line 252
    invoke-virtual {v2}, LC0/A;->getLayoutNodes()Lr/v;

    .line 253
    .line 254
    .line 255
    invoke-direct {v0}, LJ0/a;-><init>()V

    .line 256
    .line 257
    .line 258
    iput-object v0, v2, LC0/A;->C:LJ0/a;

    .line 259
    .line 260
    iput-object v2, v2, LC0/A;->D:LC0/A;

    .line 261
    .line 262
    new-instance v0, LI0/n;

    .line 263
    .line 264
    invoke-virtual {v2}, LC0/A;->getRoot()LB0/L;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v2}, LC0/A;->getLayoutNodes()Lr/v;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-direct {v0, v1, v11, v3}, LI0/n;-><init>(LB0/L;LI0/d;Lr/v;)V

    .line 273
    .line 274
    .line 275
    iput-object v0, v2, LC0/A;->E:LI0/n;

    .line 276
    .line 277
    new-instance v11, LC0/I;

    .line 278
    .line 279
    invoke-direct {v11, v2}, LC0/I;-><init>(LC0/A;)V

    .line 280
    .line 281
    .line 282
    iput-object v11, v2, LC0/A;->F:LC0/I;

    .line 283
    .line 284
    new-instance v12, Le0/c;

    .line 285
    .line 286
    new-instance v0, LC0/q;

    .line 287
    .line 288
    const/4 v6, 0x1

    .line 289
    const/4 v7, 0x0

    .line 290
    const/4 v1, 0x0

    .line 291
    const-class v3, LC0/W;

    .line 292
    .line 293
    const-string v4, "getContentCaptureSessionCompat"

    .line 294
    .line 295
    const-string v5, "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;"

    .line 296
    .line 297
    invoke-direct/range {v0 .. v7}, LC0/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 298
    .line 299
    .line 300
    invoke-direct {v12, v2, v0}, Le0/c;-><init>(LC0/A;LC0/q;)V

    .line 301
    .line 302
    .line 303
    iput-object v12, v2, LC0/A;->G:Le0/c;

    .line 304
    .line 305
    new-instance v0, LC0/g;

    .line 306
    .line 307
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 308
    .line 309
    .line 310
    const-string v1, "accessibility"

    .line 311
    .line 312
    invoke-virtual {v8, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    const-string v3, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    .line 317
    .line 318
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 322
    .line 323
    iput-object v0, v2, LC0/A;->H:LC0/g;

    .line 324
    .line 325
    new-instance v0, Lj0/d;

    .line 326
    .line 327
    invoke-direct {v0, v2}, Lj0/d;-><init>(LC0/A;)V

    .line 328
    .line 329
    .line 330
    iput-object v0, v2, LC0/A;->I:Lj0/d;

    .line 331
    .line 332
    new-instance v0, Ld0/h;

    .line 333
    .line 334
    invoke-direct {v0}, Ld0/h;-><init>()V

    .line 335
    .line 336
    .line 337
    iput-object v0, v2, LC0/A;->J:Ld0/h;

    .line 338
    .line 339
    new-instance v0, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    iput-object v0, v2, LC0/A;->K:Ljava/util/ArrayList;

    .line 345
    .line 346
    new-instance v0, Lv0/c;

    .line 347
    .line 348
    invoke-direct {v0}, Lv0/c;-><init>()V

    .line 349
    .line 350
    .line 351
    iput-object v0, v2, LC0/A;->O:Lv0/c;

    .line 352
    .line 353
    new-instance v0, LL/s;

    .line 354
    .line 355
    invoke-virtual {v2}, LC0/A;->getRoot()LB0/L;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 360
    .line 361
    .line 362
    iput-object v1, v0, LL/s;->b:Ljava/lang/Object;

    .line 363
    .line 364
    new-instance v3, LC0/H0;

    .line 365
    .line 366
    iget-object v1, v1, LB0/L;->U:LB0/g0;

    .line 367
    .line 368
    iget-object v1, v1, LB0/g0;->b:LB0/v;

    .line 369
    .line 370
    invoke-direct {v3, v1}, LC0/H0;-><init>(Lz0/m;)V

    .line 371
    .line 372
    .line 373
    iput-object v3, v0, LL/s;->c:Ljava/lang/Object;

    .line 374
    .line 375
    new-instance v1, Li3/a;

    .line 376
    .line 377
    invoke-direct {v1}, Li3/a;-><init>()V

    .line 378
    .line 379
    .line 380
    iput-object v1, v0, LL/s;->d:Ljava/lang/Object;

    .line 381
    .line 382
    new-instance v1, LB0/t;

    .line 383
    .line 384
    invoke-direct {v1}, LB0/t;-><init>()V

    .line 385
    .line 386
    .line 387
    iput-object v1, v0, LL/s;->e:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v0, v2, LC0/A;->P:LL/s;

    .line 390
    .line 391
    sget-object v0, LC0/p;->r:LC0/p;

    .line 392
    .line 393
    iput-object v0, v2, LC0/A;->Q:LB5/c;

    .line 394
    .line 395
    invoke-static {}, LC0/A;->l()Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    const-string v1, "Autofill service could not be located."

    .line 400
    .line 401
    const/4 v6, 0x0

    .line 402
    if-eqz v0, :cond_3

    .line 403
    .line 404
    new-instance v0, LE/c0;

    .line 405
    .line 406
    invoke-virtual {v2}, LC0/A;->getAutofillTree()Ld0/h;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 411
    .line 412
    .line 413
    iput-object v2, v0, LE/c0;->q:Ljava/lang/Object;

    .line 414
    .line 415
    iput-object v3, v0, LE/c0;->r:Ljava/lang/Object;

    .line 416
    .line 417
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-static {}, Lcom/google/firebase/c;->h()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-static {v3}, Lcom/google/firebase/c;->d(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    if-eqz v3, :cond_2

    .line 434
    .line 435
    iput-object v3, v0, LE/c0;->s:Ljava/lang/Object;

    .line 436
    .line 437
    invoke-static {v2}, Lcom/google/firebase/c;->o(LC0/A;)V

    .line 438
    .line 439
    .line 440
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/P1;->B(Landroid/view/View;)LE0/a;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    if-eqz v3, :cond_0

    .line 445
    .line 446
    iget-object v3, v3, LE0/a;->a:Ljava/lang/Object;

    .line 447
    .line 448
    invoke-static {v3}, LC0/U;->h(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    goto :goto_0

    .line 453
    :cond_0
    move-object v3, v6

    .line 454
    :goto_0
    if-eqz v3, :cond_1

    .line 455
    .line 456
    iput-object v3, v0, LE/c0;->t:Ljava/lang/Object;

    .line 457
    .line 458
    goto :goto_1

    .line 459
    :cond_1
    const-string v0, "Required value was null."

    .line 460
    .line 461
    invoke-static {v0}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    throw v0

    .line 466
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 467
    .line 468
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    throw v0

    .line 472
    :cond_3
    move-object v0, v6

    .line 473
    :goto_1
    iput-object v0, v2, LC0/A;->R:LE/c0;

    .line 474
    .line 475
    invoke-static {}, LC0/A;->l()Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_5

    .line 480
    .line 481
    invoke-static {}, Lcom/google/firebase/c;->h()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {v8, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-static {v0}, Lcom/google/firebase/c;->d(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    if-eqz v0, :cond_4

    .line 494
    .line 495
    new-instance v1, Ld0/b;

    .line 496
    .line 497
    move-object v3, v1

    .line 498
    new-instance v1, Lk3/d;

    .line 499
    .line 500
    const/16 v4, 0x17

    .line 501
    .line 502
    invoke-direct {v1, v4, v0}, Lk3/d;-><init>(ILjava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {p0 .. p0}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    invoke-virtual/range {p0 .. p0}, LC0/A;->getRectManager()LJ0/a;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    move-object v0, v3

    .line 518
    move-object/from16 v3, p0

    .line 519
    .line 520
    invoke-direct/range {v0 .. v5}, Ld0/b;-><init>(Lk3/d;LI0/n;LC0/A;LJ0/a;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    move-object v2, v3

    .line 524
    move-object v1, v0

    .line 525
    goto :goto_2

    .line 526
    :cond_4
    invoke-static {v1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    throw v0

    .line 531
    :cond_5
    move-object v1, v6

    .line 532
    :goto_2
    iput-object v1, v2, LC0/A;->S:Ld0/b;

    .line 533
    .line 534
    new-instance v0, LC0/i;

    .line 535
    .line 536
    invoke-direct {v0, v8}, LC0/i;-><init>(Landroid/content/Context;)V

    .line 537
    .line 538
    .line 539
    iput-object v0, v2, LC0/A;->U:LC0/i;

    .line 540
    .line 541
    new-instance v0, LC0/h;

    .line 542
    .line 543
    invoke-virtual {v2}, LC0/A;->getClipboardManager()LC0/i;

    .line 544
    .line 545
    .line 546
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 547
    .line 548
    .line 549
    iput-object v0, v2, LC0/A;->V:LC0/h;

    .line 550
    .line 551
    new-instance v0, LB0/v0;

    .line 552
    .line 553
    new-instance v1, LC0/x;

    .line 554
    .line 555
    const/4 v3, 0x1

    .line 556
    invoke-direct {v1, v2, v3}, LC0/x;-><init>(LC0/A;I)V

    .line 557
    .line 558
    .line 559
    invoke-direct {v0, v1}, LB0/v0;-><init>(LC0/x;)V

    .line 560
    .line 561
    .line 562
    iput-object v0, v2, LC0/A;->W:LB0/v0;

    .line 563
    .line 564
    new-instance v0, LB0/a0;

    .line 565
    .line 566
    invoke-virtual {v2}, LC0/A;->getRoot()LB0/L;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-direct {v0, v1}, LB0/a0;-><init>(LB0/L;)V

    .line 571
    .line 572
    .line 573
    iput-object v0, v2, LC0/A;->f0:LB0/a0;

    .line 574
    .line 575
    const v0, 0x7fffffff

    .line 576
    .line 577
    .line 578
    int-to-long v0, v0

    .line 579
    const/16 v3, 0x20

    .line 580
    .line 581
    shl-long v3, v0, v3

    .line 582
    .line 583
    const-wide v12, 0xffffffffL

    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    and-long/2addr v0, v12

    .line 589
    or-long/2addr v0, v3

    .line 590
    iput-wide v0, v2, LC0/A;->g0:J

    .line 591
    .line 592
    filled-new-array {v9, v9}, [I

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    iput-object v0, v2, LC0/A;->h0:[I

    .line 597
    .line 598
    invoke-static {}, Lj0/B;->j()[F

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-static {}, Lj0/B;->j()[F

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    iput-object v1, v2, LC0/A;->i0:[F

    .line 607
    .line 608
    invoke-static {}, Lj0/B;->j()[F

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    iput-object v1, v2, LC0/A;->j0:[F

    .line 613
    .line 614
    const-wide/16 v3, -0x1

    .line 615
    .line 616
    iput-wide v3, v2, LC0/A;->k0:J

    .line 617
    .line 618
    const-wide v3, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    iput-wide v3, v2, LC0/A;->m0:J

    .line 624
    .line 625
    const/4 v3, 0x1

    .line 626
    iput-boolean v3, v2, LC0/A;->n0:Z

    .line 627
    .line 628
    invoke-static {v6}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    iput-object v1, v2, LC0/A;->o0:LP/f0;

    .line 633
    .line 634
    new-instance v1, LC0/y;

    .line 635
    .line 636
    invoke-direct {v1, v2, v3}, LC0/y;-><init>(LC0/A;I)V

    .line 637
    .line 638
    .line 639
    invoke-static {v1}, LP/b;->m(LB5/a;)LP/C;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    iput-object v1, v2, LC0/A;->p0:LP/C;

    .line 644
    .line 645
    new-instance v1, LC0/j;

    .line 646
    .line 647
    invoke-direct {v1, v9, v2}, LC0/j;-><init>(ILjava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    iput-object v1, v2, LC0/A;->r0:LC0/j;

    .line 651
    .line 652
    new-instance v1, LC0/k;

    .line 653
    .line 654
    invoke-direct {v1, v2}, LC0/k;-><init>(LC0/A;)V

    .line 655
    .line 656
    .line 657
    iput-object v1, v2, LC0/A;->s0:LC0/k;

    .line 658
    .line 659
    new-instance v1, LC0/l;

    .line 660
    .line 661
    invoke-direct {v1, v2}, LC0/l;-><init>(LC0/A;)V

    .line 662
    .line 663
    .line 664
    iput-object v1, v2, LC0/A;->t0:LC0/l;

    .line 665
    .line 666
    new-instance v1, LP0/c;

    .line 667
    .line 668
    invoke-virtual {v2}, LC0/A;->getView()Landroid/view/View;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    invoke-direct {v1, v3, v2}, LP0/c;-><init>(Landroid/view/View;LC0/A;)V

    .line 673
    .line 674
    .line 675
    iput-object v1, v2, LC0/A;->u0:LP0/c;

    .line 676
    .line 677
    new-instance v1, LP0/e;

    .line 678
    .line 679
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 680
    .line 681
    .line 682
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 683
    .line 684
    invoke-direct {v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    iput-object v1, v2, LC0/A;->v0:LP0/e;

    .line 688
    .line 689
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 690
    .line 691
    invoke-direct {v1, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    iput-object v1, v2, LC0/A;->w0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 695
    .line 696
    new-instance v1, LC0/E0;

    .line 697
    .line 698
    invoke-virtual {v2}, LC0/A;->getTextInputService()LP0/e;

    .line 699
    .line 700
    .line 701
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 702
    .line 703
    .line 704
    iput-object v1, v2, LC0/A;->x0:LC0/E0;

    .line 705
    .line 706
    new-instance v1, LC0/E0;

    .line 707
    .line 708
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 709
    .line 710
    .line 711
    iput-object v1, v2, LC0/A;->y0:LC0/E0;

    .line 712
    .line 713
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/P1;->r(Landroid/content/Context;)LO0/e;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    new-instance v3, LP/f0;

    .line 718
    .line 719
    invoke-direct {v3, v1, v10}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 720
    .line 721
    .line 722
    iput-object v3, v2, LC0/A;->z0:LP/f0;

    .line 723
    .line 724
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 733
    .line 734
    const/16 v4, 0x1f

    .line 735
    .line 736
    if-lt v3, v4, :cond_6

    .line 737
    .line 738
    invoke-static {v1}, LB3/e;->a(Landroid/content/res/Configuration;)I

    .line 739
    .line 740
    .line 741
    move-result v1

    .line 742
    goto :goto_3

    .line 743
    :cond_6
    move v1, v9

    .line 744
    :goto_3
    iput v1, v2, LC0/A;->A0:I

    .line 745
    .line 746
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 755
    .line 756
    .line 757
    move-result v1

    .line 758
    sget-object v5, LW0/l;->q:LW0/l;

    .line 759
    .line 760
    if-eqz v1, :cond_8

    .line 761
    .line 762
    const/4 v7, 0x1

    .line 763
    if-eq v1, v7, :cond_7

    .line 764
    .line 765
    move-object v1, v6

    .line 766
    goto :goto_4

    .line 767
    :cond_7
    sget-object v1, LW0/l;->r:LW0/l;

    .line 768
    .line 769
    goto :goto_4

    .line 770
    :cond_8
    move-object v1, v5

    .line 771
    :goto_4
    if-nez v1, :cond_9

    .line 772
    .line 773
    goto :goto_5

    .line 774
    :cond_9
    move-object v5, v1

    .line 775
    :goto_5
    invoke-static {v5}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    iput-object v1, v2, LC0/A;->B0:LP/f0;

    .line 780
    .line 781
    new-instance v1, Lr0/b;

    .line 782
    .line 783
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 784
    .line 785
    .line 786
    iput-object v1, v2, LC0/A;->C0:Lr0/b;

    .line 787
    .line 788
    new-instance v1, Ls0/c;

    .line 789
    .line 790
    invoke-virtual {v2}, Landroid/view/View;->isInTouchMode()Z

    .line 791
    .line 792
    .line 793
    move-result v5

    .line 794
    if-eqz v5, :cond_a

    .line 795
    .line 796
    const/4 v5, 0x1

    .line 797
    goto :goto_6

    .line 798
    :cond_a
    const/4 v5, 0x2

    .line 799
    :goto_6
    invoke-direct {v1, v5}, Ls0/c;-><init>(I)V

    .line 800
    .line 801
    .line 802
    iput-object v1, v2, LC0/A;->D0:Ls0/c;

    .line 803
    .line 804
    new-instance v1, LA0/e;

    .line 805
    .line 806
    invoke-direct {v1, v2}, LA0/e;-><init>(LC0/A;)V

    .line 807
    .line 808
    .line 809
    iput-object v1, v2, LC0/A;->E0:LA0/e;

    .line 810
    .line 811
    new-instance v1, LC0/E0;

    .line 812
    .line 813
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 814
    .line 815
    .line 816
    iput-object v1, v2, LC0/A;->F0:LC0/E0;

    .line 817
    .line 818
    new-instance v1, LB0/o;

    .line 819
    .line 820
    const/4 v5, 0x4

    .line 821
    invoke-direct {v1, v5}, LB0/o;-><init>(I)V

    .line 822
    .line 823
    .line 824
    iput-object v1, v2, LC0/A;->I0:LB0/o;

    .line 825
    .line 826
    new-instance v1, Lr/C;

    .line 827
    .line 828
    invoke-direct {v1}, Lr/C;-><init>()V

    .line 829
    .line 830
    .line 831
    iput-object v1, v2, LC0/A;->J0:Lr/C;

    .line 832
    .line 833
    new-instance v1, LA1/b;

    .line 834
    .line 835
    const/4 v7, 0x1

    .line 836
    invoke-direct {v1, v7, v2}, LA1/b;-><init>(ILjava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    iput-object v1, v2, LC0/A;->K0:LA1/b;

    .line 840
    .line 841
    new-instance v1, LC0/m;

    .line 842
    .line 843
    invoke-direct {v1, v9, v2}, LC0/m;-><init>(ILjava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    iput-object v1, v2, LC0/A;->L0:LC0/m;

    .line 847
    .line 848
    new-instance v1, LC0/y;

    .line 849
    .line 850
    invoke-direct {v1, v2, v9}, LC0/y;-><init>(LC0/A;I)V

    .line 851
    .line 852
    .line 853
    iput-object v1, v2, LC0/A;->N0:LC0/y;

    .line 854
    .line 855
    const/16 v1, 0x1d

    .line 856
    .line 857
    if-ge v3, v1, :cond_b

    .line 858
    .line 859
    new-instance v5, LC0/n0;

    .line 860
    .line 861
    invoke-direct {v5, v0}, LC0/n0;-><init>([F)V

    .line 862
    .line 863
    .line 864
    goto :goto_7

    .line 865
    :cond_b
    new-instance v5, LC0/o0;

    .line 866
    .line 867
    invoke-direct {v5}, LC0/o0;-><init>()V

    .line 868
    .line 869
    .line 870
    :goto_7
    iput-object v5, v2, LC0/A;->O0:LC0/m0;

    .line 871
    .line 872
    iget-object v0, v2, LC0/A;->G:Le0/c;

    .line 873
    .line 874
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2, v9}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 878
    .line 879
    .line 880
    const/4 v7, 0x1

    .line 881
    invoke-virtual {v2, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 882
    .line 883
    .line 884
    const/16 v0, 0x1a

    .line 885
    .line 886
    if-lt v3, v0, :cond_c

    .line 887
    .line 888
    sget-object v0, LC0/V;->a:LC0/V;

    .line 889
    .line 890
    invoke-virtual {v0, v2, v7, v9}, LC0/V;->a(Landroid/view/View;IZ)V

    .line 891
    .line 892
    .line 893
    :cond_c
    invoke-virtual {v2, v7}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 897
    .line 898
    .line 899
    invoke-static {v2, v11}, Lw1/K;->m(Landroid/view/View;Lw1/b;)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v2}, LC0/A;->getDragAndDropManager()Lf0/a;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v2}, LC0/A;->getRoot()LB0/L;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    invoke-virtual {v0, v2}, LB0/L;->b(LB0/t0;)V

    .line 914
    .line 915
    .line 916
    if-lt v3, v1, :cond_d

    .line 917
    .line 918
    sget-object v0, LC0/O;->a:LC0/O;

    .line 919
    .line 920
    invoke-virtual {v0, v2}, LC0/O;->a(Landroid/view/View;)V

    .line 921
    .line 922
    .line 923
    :cond_d
    if-lt v3, v4, :cond_e

    .line 924
    .line 925
    new-instance v6, LC0/I0;

    .line 926
    .line 927
    const/4 v7, 0x1

    .line 928
    invoke-direct {v6, v7}, LC0/I0;-><init>(I)V

    .line 929
    .line 930
    .line 931
    :cond_e
    iput-object v6, v2, LC0/A;->Q0:LC0/I0;

    .line 932
    .line 933
    new-instance v0, LC0/E0;

    .line 934
    .line 935
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 936
    .line 937
    .line 938
    sget-object v1, Lv0/j;->a:Lv0/i;

    .line 939
    .line 940
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    iput-object v0, v2, LC0/A;->R0:LC0/E0;

    .line 944
    .line 945
    return-void
.end method

.method public static final g(LC0/A;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, LC0/A;->F:LC0/I;

    .line 2
    .line 3
    iget-object v0, p0, LC0/I;->G:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, LC0/I;->E:Lr/t;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lr/t;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eq p0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, LC0/I;->H:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, LC0/I;->F:Lr/t;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lr/t;->d(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eq p0, v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime Lm5/c;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui_release$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getTextInputService$annotations()V
    .locals 0
    .annotation runtime Lm5/c;
    .end annotation

    .line 1
    return-void
.end method

.method private final get_viewTreeOwners()LC0/n;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->o0:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC0/n;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final synthetic h(LC0/A;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic i(LC0/A;Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic j(LC0/A;)LC0/n;
    .locals 0

    .line 1
    invoke-direct {p0}, LC0/A;->get_viewTreeOwners()LC0/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final k(LC0/A;Lh0/c;Li0/c;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget p1, p1, Lh0/c;->a:I

    .line 17
    .line 18
    invoke-static {p1}, Lh0/d;->D(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/16 p1, 0x82

    .line 30
    .line 31
    :goto_0
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-static {p2}, Lj0/B;->u(Li0/c;)Landroid/graphics/Rect;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p2, 0x0

    .line 39
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_3
    :goto_2
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method public static l()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static m(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    instance-of v3, v2, LC0/A;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    check-cast v2, LC0/A;

    .line 17
    .line 18
    invoke-virtual {v2}, LC0/A;->C()V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v2, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-static {v2}, LC0/A;->m(Landroid/view/ViewGroup;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public static o(I)J
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/high16 v1, 0x40000000    # 2.0f

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    int-to-long v0, p0

    .line 23
    shl-long v2, v0, v2

    .line 24
    .line 25
    or-long/2addr v0, v2

    .line 26
    return-wide v0

    .line 27
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_1
    int-to-long v0, v3

    .line 34
    shl-long/2addr v0, v2

    .line 35
    const p0, 0x7fffffff

    .line 36
    .line 37
    .line 38
    int-to-long v2, p0

    .line 39
    or-long/2addr v0, v2

    .line 40
    return-wide v0

    .line 41
    :cond_2
    int-to-long v0, v3

    .line 42
    shl-long/2addr v0, v2

    .line 43
    int-to-long v2, p0

    .line 44
    or-long/2addr v0, v2

    .line 45
    return-wide v0
.end method

.method public static p(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    const-class v0, Landroid/view/View;

    .line 9
    .line 10
    const-string v1, "getAccessibilityViewId"

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    check-cast p0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x0

    .line 46
    :goto_0
    if-ge v1, v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3, p1}, LC0/A;->p(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    return-object v3

    .line 59
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-object v2
.end method

.method public static s(LB0/L;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LB0/L;->B()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LB0/L;->w()LR/e;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, LR/e;->q:[Ljava/lang/Object;

    .line 9
    .line 10
    iget p0, p0, LR/e;->s:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, p0, :cond_0

    .line 14
    .line 15
    aget-object v2, v0, v1

    .line 16
    .line 17
    check-cast v2, LB0/L;

    .line 18
    .line 19
    invoke-static {v2}, LC0/A;->s(LB0/L;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method private setDensity(LW0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->t:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setFontFamilyResolver(LO0/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->z0:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setLayoutDirection(LW0/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->B0:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final set_viewTreeOwners(LC0/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->o0:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static u(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0x7fffffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 16
    .line 17
    if-ge v0, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    and-int/2addr v0, v1

    .line 28
    if-ge v0, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/2addr v0, v1

    .line 39
    if-ge v0, v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    and-int/2addr v0, v1

    .line 50
    if-ge v0, v4, :cond_0

    .line 51
    .line 52
    move v0, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v0, v3

    .line 55
    :goto_0
    if-nez v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    move v6, v3

    .line 62
    :goto_1
    if-ge v6, v5, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getX(I)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    and-int/2addr v0, v1

    .line 73
    if-ge v0, v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getY(I)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    and-int/2addr v0, v1

    .line 84
    if-ge v0, v4, :cond_2

    .line 85
    .line 86
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 87
    .line 88
    const/16 v7, 0x1d

    .line 89
    .line 90
    if-lt v0, v7, :cond_1

    .line 91
    .line 92
    sget-object v0, LC0/L0;->a:LC0/L0;

    .line 93
    .line 94
    invoke-virtual {v0, p0, v6}, LC0/L0;->a(Landroid/view/MotionEvent;I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    move v0, v2

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    :goto_2
    move v0, v3

    .line 104
    :goto_3
    if-nez v0, :cond_3

    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    return v0
.end method


# virtual methods
.method public final A(LB0/L;J)V
    .locals 2

    .line 1
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, LB0/a0;->k(LB0/L;J)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, LB0/a0;->b:LB0/o;

    .line 12
    .line 13
    invoke-virtual {p1}, LB0/o;->E()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p1}, LB0/a0;->a(Z)V

    .line 21
    .line 22
    .line 23
    iget-boolean p2, p0, LC0/A;->N:Z

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    .line 32
    .line 33
    .line 34
    iput-boolean p1, p0, LC0/A;->N:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    invoke-virtual {p0}, LC0/A;->getRectManager()LJ0/a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, LJ0/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method public final B(LB0/s0;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->K:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget-boolean p2, p0, LC0/A;->M:Z

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, LC0/A;->L:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    iget-boolean p2, p0, LC0/A;->M:Z

    .line 21
    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    iget-object p2, p0, LC0/A;->L:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-nez p2, :cond_3

    .line 31
    .line 32
    new-instance p2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, LC0/A;->L:Ljava/util/ArrayList;

    .line 38
    .line 39
    :cond_3
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final C()V
    .locals 11

    .line 1
    iget-boolean v0, p0, LC0/A;->T:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, LB0/v0;->a:La0/t;

    .line 13
    .line 14
    iget-object v4, v0, La0/t;->g:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v4

    .line 17
    :try_start_0
    iget-object v0, v0, La0/t;->f:LR/e;

    .line 18
    .line 19
    iget v5, v0, LR/e;->s:I

    .line 20
    .line 21
    move v6, v3

    .line 22
    move v7, v6

    .line 23
    :goto_0
    if-ge v6, v5, :cond_3

    .line 24
    .line 25
    iget-object v8, v0, LR/e;->q:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v8, v8, v6

    .line 28
    .line 29
    check-cast v8, La0/s;

    .line 30
    .line 31
    invoke-virtual {v8}, La0/s;->e()V

    .line 32
    .line 33
    .line 34
    iget-object v8, v8, La0/s;->f:Lr/G;

    .line 35
    .line 36
    iget v8, v8, Lr/G;->e:I

    .line 37
    .line 38
    if-eqz v8, :cond_0

    .line 39
    .line 40
    move v8, v2

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    move v8, v3

    .line 43
    :goto_1
    if-nez v8, :cond_1

    .line 44
    .line 45
    add-int/lit8 v7, v7, 0x1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    if-lez v7, :cond_2

    .line 49
    .line 50
    iget-object v8, v0, LR/e;->q:[Ljava/lang/Object;

    .line 51
    .line 52
    sub-int v9, v6, v7

    .line 53
    .line 54
    aget-object v10, v8, v6

    .line 55
    .line 56
    aput-object v10, v8, v9

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object v6, v0, LR/e;->q:[Ljava/lang/Object;

    .line 65
    .line 66
    sub-int v7, v5, v7

    .line 67
    .line 68
    invoke-static {v6, v7, v5, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput v7, v0, LR/e;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    monitor-exit v4

    .line 74
    iput-boolean v3, p0, LC0/A;->T:Z

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :goto_3
    monitor-exit v4

    .line 78
    throw v0

    .line 79
    :cond_4
    :goto_4
    iget-object v0, p0, LC0/A;->b0:LC0/k0;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    invoke-static {v0}, LC0/A;->m(Landroid/view/ViewGroup;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    invoke-static {}, LC0/A;->l()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    iget-object v0, p0, LC0/A;->S:Ld0/b;

    .line 93
    .line 94
    if-eqz v0, :cond_7

    .line 95
    .line 96
    iget-object v4, v0, Ld0/b;->g:Lr/w;

    .line 97
    .line 98
    iget v5, v4, Lr/w;->d:I

    .line 99
    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    iget-boolean v5, v0, Ld0/b;->h:Z

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    iget-object v5, v0, Ld0/b;->a:Lk3/d;

    .line 107
    .line 108
    iget-object v5, v5, Lk3/d;->r:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Landroid/view/autofill/AutofillManager;

    .line 111
    .line 112
    invoke-static {v5}, Lcom/google/firebase/c;->v(Landroid/view/autofill/AutofillManager;)V

    .line 113
    .line 114
    .line 115
    iput-boolean v3, v0, Ld0/b;->h:Z

    .line 116
    .line 117
    :cond_6
    iget v4, v4, Lr/w;->d:I

    .line 118
    .line 119
    if-eqz v4, :cond_7

    .line 120
    .line 121
    iput-boolean v2, v0, Ld0/b;->h:Z

    .line 122
    .line 123
    :cond_7
    :goto_5
    iget-object v0, p0, LC0/A;->J0:Lr/C;

    .line 124
    .line 125
    invoke-virtual {v0}, Lr/C;->h()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_b

    .line 130
    .line 131
    iget-object v0, p0, LC0/A;->J0:Lr/C;

    .line 132
    .line 133
    invoke-virtual {v0, v3}, Lr/C;->e(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_b

    .line 138
    .line 139
    iget-object v0, p0, LC0/A;->J0:Lr/C;

    .line 140
    .line 141
    iget v0, v0, Lr/C;->b:I

    .line 142
    .line 143
    move v2, v3

    .line 144
    :goto_6
    if-ge v2, v0, :cond_a

    .line 145
    .line 146
    iget-object v4, p0, LC0/A;->J0:Lr/C;

    .line 147
    .line 148
    invoke-virtual {v4, v2}, Lr/C;->e(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    check-cast v4, LB5/a;

    .line 153
    .line 154
    iget-object v5, p0, LC0/A;->J0:Lr/C;

    .line 155
    .line 156
    if-ltz v2, :cond_9

    .line 157
    .line 158
    iget v6, v5, Lr/C;->b:I

    .line 159
    .line 160
    if-ge v2, v6, :cond_9

    .line 161
    .line 162
    iget-object v5, v5, Lr/C;->a:[Ljava/lang/Object;

    .line 163
    .line 164
    aget-object v6, v5, v2

    .line 165
    .line 166
    aput-object v1, v5, v2

    .line 167
    .line 168
    if-eqz v4, :cond_8

    .line 169
    .line 170
    invoke-interface {v4}, LB5/a;->invoke()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_9
    invoke-virtual {v5, v2}, Lr/C;->l(I)V

    .line 177
    .line 178
    .line 179
    throw v1

    .line 180
    :cond_a
    iget-object v2, p0, LC0/A;->J0:Lr/C;

    .line 181
    .line 182
    invoke-virtual {v2, v3, v0}, Lr/C;->j(II)V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_b
    return-void
.end method

.method public final D()Li0/c;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lh0/h;

    .line 13
    .line 14
    iget-object v0, v0, Lh0/h;->d:Lh0/o;

    .line 15
    .line 16
    invoke-static {v0}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Lh0/d;->j(Lh0/o;)Li0/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_0
    return-object v1

    .line 28
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-static {v0, p0}, Lh0/d;->d(Landroid/view/View;LC0/A;)Li0/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :cond_2
    return-object v1
.end method

.method public final E(LB0/L;)V
    .locals 3

    .line 1
    iget-object v0, p0, LC0/A;->F:LC0/I;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, LC0/I;->A:Z

    .line 5
    .line 6
    invoke-virtual {v0}, LC0/I;->u()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, LC0/I;->v(LB0/L;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object p1, p0, LC0/A;->G:Le0/c;

    .line 17
    .line 18
    iput-boolean v1, p1, Le0/c;->w:Z

    .line 19
    .line 20
    invoke-virtual {p1}, Le0/c;->i()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object p1, p1, Le0/c;->x:LO5/e;

    .line 27
    .line 28
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 29
    .line 30
    invoke-interface {p1, v0}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final F(LB0/L;ZZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 2
    .line 3
    if-eqz p2, :cond_b

    .line 4
    .line 5
    iget-object p2, v0, LB0/a0;->b:LB0/o;

    .line 6
    .line 7
    iget-object v1, p1, LB0/L;->x:LB0/L;

    .line 8
    .line 9
    iget-object v2, p1, LB0/L;->V:LB0/P;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v1, "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"

    .line 15
    .line 16
    invoke-static {v1}, Ly0/a;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v1, v2, LB0/P;->d:LB0/G;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v1, :cond_a

    .line 27
    .line 28
    if-eq v1, v3, :cond_c

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    if-eq v1, v4, :cond_a

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    if-eq v1, v4, :cond_a

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    if-ne v1, v4, :cond_9

    .line 38
    .line 39
    iget-boolean v1, v2, LB0/P;->e:Z

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    if-nez p3, :cond_1

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_1
    iput-boolean v3, v2, LB0/P;->e:Z

    .line 48
    .line 49
    iget-object p3, v2, LB0/P;->p:LB0/c0;

    .line 50
    .line 51
    iput-boolean v3, p3, LB0/c0;->J:Z

    .line 52
    .line 53
    iget-boolean p3, p1, LB0/L;->e0:Z

    .line 54
    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_2
    invoke-virtual {p1}, LB0/L;->H()Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {p3, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-nez p3, :cond_3

    .line 70
    .line 71
    iget-boolean p3, v2, LB0/P;->e:Z

    .line 72
    .line 73
    if-eqz p3, :cond_4

    .line 74
    .line 75
    invoke-virtual {p1}, LB0/L;->r()LB0/I;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    sget-object v1, LB0/I;->q:LB0/I;

    .line 80
    .line 81
    if-eq p3, v1, :cond_3

    .line 82
    .line 83
    iget-object p3, v2, LB0/P;->q:LB0/Y;

    .line 84
    .line 85
    if-eqz p3, :cond_4

    .line 86
    .line 87
    iget-object p3, p3, LB0/Y;->G:LB0/M;

    .line 88
    .line 89
    if-eqz p3, :cond_4

    .line 90
    .line 91
    invoke-virtual {p3}, LB0/M;->e()Z

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    if-ne p3, v3, :cond_4

    .line 96
    .line 97
    :cond_3
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    if-eqz p3, :cond_7

    .line 102
    .line 103
    iget-object p3, p3, LB0/L;->V:LB0/P;

    .line 104
    .line 105
    iget-boolean p3, p3, LB0/P;->e:Z

    .line 106
    .line 107
    if-ne p3, v3, :cond_7

    .line 108
    .line 109
    :cond_4
    invoke-virtual {p1}, LB0/L;->G()Z

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    if-nez p3, :cond_5

    .line 114
    .line 115
    invoke-static {p1}, LB0/a0;->h(LB0/L;)Z

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    if-eqz p3, :cond_8

    .line 120
    .line 121
    :cond_5
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    if-eqz p3, :cond_6

    .line 126
    .line 127
    invoke-virtual {p3}, LB0/L;->q()Z

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    if-ne p3, v3, :cond_6

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    const/4 p3, 0x0

    .line 135
    invoke-virtual {p2, p1, p3}, LB0/o;->l(LB0/L;Z)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_7
    invoke-virtual {p2, p1, v3}, LB0/o;->l(LB0/L;Z)V

    .line 140
    .line 141
    .line 142
    :cond_8
    :goto_1
    iget-boolean p2, v0, LB0/a0;->d:Z

    .line 143
    .line 144
    if-nez p2, :cond_c

    .line 145
    .line 146
    if-eqz p4, :cond_c

    .line 147
    .line 148
    invoke-virtual {p0, p1}, LC0/A;->L(LB0/L;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_9
    new-instance p1, LC2/e;

    .line 153
    .line 154
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_a
    iget-object p2, v0, LB0/a0;->h:LR/e;

    .line 159
    .line 160
    new-instance p4, LB0/Z;

    .line 161
    .line 162
    invoke-direct {p4, p1, v3, p3}, LB0/Z;-><init>(LB0/L;ZZ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, p4}, LR/e;->c(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_b
    invoke-virtual {v0, p1, p3}, LB0/a0;->p(LB0/L;Z)Z

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-eqz p2, :cond_c

    .line 174
    .line 175
    if-eqz p4, :cond_c

    .line 176
    .line 177
    invoke-virtual {p0, p1}, LC0/A;->L(LB0/L;)V

    .line 178
    .line 179
    .line 180
    :cond_c
    :goto_2
    return-void
.end method

.method public final G(LB0/L;ZZ)V
    .locals 9

    .line 1
    iget-object v0, p1, LB0/L;->V:LB0/P;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x0

    .line 8
    iget-object v6, p0, LC0/A;->f0:LB0/a0;

    .line 9
    .line 10
    const/4 v7, 0x1

    .line 11
    if-eqz p2, :cond_b

    .line 12
    .line 13
    iget-object p2, v6, LB0/a0;->b:LB0/o;

    .line 14
    .line 15
    iget-object v8, v0, LB0/P;->d:LB0/G;

    .line 16
    .line 17
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    if-eqz v8, :cond_1

    .line 22
    .line 23
    if-eq v8, v7, :cond_13

    .line 24
    .line 25
    if-eq v8, v4, :cond_1

    .line 26
    .line 27
    if-eq v8, v3, :cond_13

    .line 28
    .line 29
    if-ne v8, v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, LC2/e;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    :goto_0
    iget-boolean v2, v0, LB0/P;->e:Z

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    iget-boolean v2, v0, LB0/P;->f:Z

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    :cond_2
    if-nez p3, :cond_3

    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_3
    iput-boolean v7, v0, LB0/P;->f:Z

    .line 51
    .line 52
    iput-boolean v7, v0, LB0/P;->g:Z

    .line 53
    .line 54
    iget-object p3, v0, LB0/P;->p:LB0/c0;

    .line 55
    .line 56
    iput-boolean v7, p3, LB0/c0;->K:Z

    .line 57
    .line 58
    iput-boolean v7, p3, LB0/c0;->L:Z

    .line 59
    .line 60
    iget-boolean p3, p1, LB0/L;->e0:Z

    .line 61
    .line 62
    if-eqz p3, :cond_4

    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_4
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {p1}, LB0/L;->H()Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    if-eqz p3, :cond_5

    .line 83
    .line 84
    iget-object v0, p3, LB0/L;->V:LB0/P;

    .line 85
    .line 86
    iget-boolean v0, v0, LB0/P;->e:Z

    .line 87
    .line 88
    if-ne v0, v7, :cond_5

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    if-eqz p3, :cond_6

    .line 92
    .line 93
    iget-object v0, p3, LB0/L;->V:LB0/P;

    .line 94
    .line 95
    iget-boolean v0, v0, LB0/P;->f:Z

    .line 96
    .line 97
    if-ne v0, v7, :cond_6

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_6
    invoke-virtual {p2, p1, v7}, LB0/o;->l(LB0/L;Z)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_7
    :goto_1
    invoke-virtual {p1}, LB0/L;->G()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_a

    .line 109
    .line 110
    if-eqz p3, :cond_8

    .line 111
    .line 112
    invoke-virtual {p3}, LB0/L;->p()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-ne v0, v7, :cond_8

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_8
    if-eqz p3, :cond_9

    .line 120
    .line 121
    invoke-virtual {p3}, LB0/L;->q()Z

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    if-ne p3, v7, :cond_9

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_9
    invoke-virtual {p2, p1, v5}, LB0/o;->l(LB0/L;Z)V

    .line 129
    .line 130
    .line 131
    :cond_a
    :goto_2
    iget-boolean p1, v6, LB0/a0;->d:Z

    .line 132
    .line 133
    if-nez p1, :cond_13

    .line 134
    .line 135
    invoke-virtual {p0, v1}, LC0/A;->L(LB0/L;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object p2, v0, LB0/P;->d:LB0/G;

    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-eqz p2, :cond_13

    .line 149
    .line 150
    if-eq p2, v7, :cond_13

    .line 151
    .line 152
    if-eq p2, v4, :cond_13

    .line 153
    .line 154
    if-eq p2, v3, :cond_13

    .line 155
    .line 156
    if-ne p2, v2, :cond_12

    .line 157
    .line 158
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    if-eqz p2, :cond_d

    .line 163
    .line 164
    invoke-virtual {p2}, LB0/L;->G()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_c

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_c
    move v2, v5

    .line 172
    goto :goto_4

    .line 173
    :cond_d
    :goto_3
    move v2, v7

    .line 174
    :goto_4
    if-nez p3, :cond_e

    .line 175
    .line 176
    invoke-virtual {p1}, LB0/L;->q()Z

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    if-nez p3, :cond_13

    .line 181
    .line 182
    invoke-virtual {p1}, LB0/L;->p()Z

    .line 183
    .line 184
    .line 185
    move-result p3

    .line 186
    if-eqz p3, :cond_e

    .line 187
    .line 188
    invoke-virtual {p1}, LB0/L;->G()Z

    .line 189
    .line 190
    .line 191
    move-result p3

    .line 192
    if-ne p3, v2, :cond_e

    .line 193
    .line 194
    invoke-virtual {p1}, LB0/L;->G()Z

    .line 195
    .line 196
    .line 197
    move-result p3

    .line 198
    iget-object v3, v0, LB0/P;->p:LB0/c0;

    .line 199
    .line 200
    iget-boolean v3, v3, LB0/c0;->I:Z

    .line 201
    .line 202
    if-ne p3, v3, :cond_e

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_e
    iget-object p3, v0, LB0/P;->p:LB0/c0;

    .line 206
    .line 207
    iput-boolean v7, p3, LB0/c0;->K:Z

    .line 208
    .line 209
    iput-boolean v7, p3, LB0/c0;->L:Z

    .line 210
    .line 211
    iget-boolean v0, p1, LB0/L;->e0:Z

    .line 212
    .line 213
    if-eqz v0, :cond_f

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_f
    iget-boolean p3, p3, LB0/c0;->I:Z

    .line 217
    .line 218
    if-eqz p3, :cond_13

    .line 219
    .line 220
    if-eqz v2, :cond_13

    .line 221
    .line 222
    if-eqz p2, :cond_10

    .line 223
    .line 224
    invoke-virtual {p2}, LB0/L;->p()Z

    .line 225
    .line 226
    .line 227
    move-result p3

    .line 228
    if-ne p3, v7, :cond_10

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_10
    if-eqz p2, :cond_11

    .line 232
    .line 233
    invoke-virtual {p2}, LB0/L;->q()Z

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    if-ne p2, v7, :cond_11

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_11
    iget-object p2, v6, LB0/a0;->b:LB0/o;

    .line 241
    .line 242
    invoke-virtual {p2, p1, v5}, LB0/o;->l(LB0/L;Z)V

    .line 243
    .line 244
    .line 245
    :goto_5
    iget-boolean p1, v6, LB0/a0;->d:Z

    .line 246
    .line 247
    if-nez p1, :cond_13

    .line 248
    .line 249
    invoke-virtual {p0, v1}, LC0/A;->L(LB0/L;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_12
    new-instance p1, LC2/e;

    .line 254
    .line 255
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :cond_13
    :goto_6
    return-void
.end method

.method public final H()V
    .locals 3

    .line 1
    iget-object v0, p0, LC0/A;->F:LC0/I;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, LC0/I;->A:Z

    .line 5
    .line 6
    invoke-virtual {v0}, LC0/I;->u()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-boolean v2, v0, LC0/I;->L:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iput-boolean v1, v0, LC0/I;->L:Z

    .line 17
    .line 18
    iget-object v2, v0, LC0/I;->l:Landroid/os/Handler;

    .line 19
    .line 20
    iget-object v0, v0, LC0/I;->M:LC0/m;

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, LC0/A;->G:Le0/c;

    .line 26
    .line 27
    iput-boolean v1, v0, Le0/c;->w:Z

    .line 28
    .line 29
    invoke-virtual {v0}, Le0/c;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-boolean v2, v0, Le0/c;->D:Z

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    iput-boolean v1, v0, Le0/c;->D:Z

    .line 40
    .line 41
    iget-object v1, v0, Le0/c;->y:Landroid/os/Handler;

    .line 42
    .line 43
    iget-object v0, v0, Le0/c;->E:LC0/m;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final I()V
    .locals 6

    .line 1
    iget-boolean v0, p0, LC0/A;->l0:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, LC0/A;->k0:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iput-wide v0, p0, LC0/A;->k0:J

    .line 16
    .line 17
    iget-object v0, p0, LC0/A;->O0:LC0/m0;

    .line 18
    .line 19
    iget-object v1, p0, LC0/A;->i0:[F

    .line 20
    .line 21
    invoke-interface {v0, p0, v1}, LC0/m0;->a(Landroid/view/View;[F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LC0/A;->j0:[F

    .line 25
    .line 26
    invoke-static {v1, v0}, LC0/W;->i([F[F)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v1, p0

    .line 34
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Landroid/view/View;

    .line 40
    .line 41
    move-object v0, v1

    .line 42
    check-cast v0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object v0, p0, LC0/A;->h0:[I

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    aget v3, v0, v2

    .line 56
    .line 57
    int-to-float v3, v3

    .line 58
    const/4 v4, 0x1

    .line 59
    aget v5, v0, v4

    .line 60
    .line 61
    int-to-float v5, v5

    .line 62
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 63
    .line 64
    .line 65
    aget v1, v0, v2

    .line 66
    .line 67
    int-to-float v1, v1

    .line 68
    aget v0, v0, v4

    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    sub-float/2addr v3, v1

    .line 72
    sub-float/2addr v5, v0

    .line 73
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    int-to-long v0, v0

    .line 78
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    int-to-long v2, v2

    .line 83
    const/16 v4, 0x20

    .line 84
    .line 85
    shl-long/2addr v0, v4

    .line 86
    const-wide v4, 0xffffffffL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    and-long/2addr v2, v4

    .line 92
    or-long/2addr v0, v2

    .line 93
    iput-wide v0, p0, LC0/A;->m0:J

    .line 94
    .line 95
    :cond_1
    return-void
.end method

.method public final J(Landroid/view/MotionEvent;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, LC0/A;->k0:J

    .line 6
    .line 7
    iget-object v0, p0, LC0/A;->O0:LC0/m0;

    .line 8
    .line 9
    iget-object v1, p0, LC0/A;->i0:[F

    .line 10
    .line 11
    invoke-interface {v0, p0, v1}, LC0/m0;->a(Landroid/view/View;[F)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LC0/A;->j0:[F

    .line 15
    .line 16
    invoke-static {v1, v0}, LC0/W;->i([F[F)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v3, v0

    .line 32
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    int-to-long v5, v0

    .line 37
    const/16 v0, 0x20

    .line 38
    .line 39
    shl-long v2, v3, v0

    .line 40
    .line 41
    const-wide v7, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long v4, v5, v7

    .line 47
    .line 48
    or-long/2addr v2, v4

    .line 49
    invoke-static {v1, v2, v3}, Lj0/B;->o([FJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    shr-long v4, v1, v0

    .line 58
    .line 59
    long-to-int v4, v4

    .line 60
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-float/2addr v3, v4

    .line 65
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    and-long/2addr v1, v7

    .line 70
    long-to-int v1, v1

    .line 71
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    sub-float/2addr p1, v1

    .line 76
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    int-to-long v1, v1

    .line 81
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    int-to-long v3, p1

    .line 86
    shl-long v0, v1, v0

    .line 87
    .line 88
    and-long v2, v3, v7

    .line 89
    .line 90
    or-long/2addr v0, v2

    .line 91
    iput-wide v0, p0, LC0/A;->m0:J

    .line 92
    .line 93
    return-void
.end method

.method public final K(LB0/s0;)V
    .locals 3

    .line 1
    iget-object v0, p0, LC0/A;->c0:LC0/z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, LC0/d1;->F:LC0/c1;

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, LC0/A;->I0:LB0/o;

    .line 8
    .line 9
    iget-object v1, v0, LB0/o;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 12
    .line 13
    iget-object v2, v0, LB0/o;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, LR/e;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2, v1}, LR/e;->l(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_1
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/ref/ReferenceQueue;

    .line 33
    .line 34
    invoke-direct {v1, p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, LR/e;->c(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, LC0/A;->K:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final L(LB0/L;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, LB0/L;->V:LB0/P;

    .line 18
    .line 19
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 20
    .line 21
    iget-object v0, v0, LB0/c0;->B:LB0/I;

    .line 22
    .line 23
    sget-object v1, LB0/I;->q:LB0/I;

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    iget-boolean v0, p0, LC0/A;->e0:Z

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 38
    .line 39
    iget-object v0, v0, LB0/g0;->b:LB0/v;

    .line 40
    .line 41
    iget-wide v0, v0, Lz0/J;->t:J

    .line 42
    .line 43
    invoke-static {v0, v1}, LW0/a;->f(J)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-static {v0, v1}, LW0/a;->e(J)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-void
.end method

.method public final M(J)J
    .locals 6

    .line 1
    invoke-virtual {p0}, LC0/A;->I()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    shr-long v1, p1, v0

    .line 7
    .line 8
    long-to-int v1, v1

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-wide v2, p0, LC0/A;->m0:J

    .line 14
    .line 15
    shr-long/2addr v2, v0

    .line 16
    long-to-int v2, v2

    .line 17
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-float/2addr v1, v2

    .line 22
    const-wide v2, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p1, v2

    .line 28
    long-to-int p1, p1

    .line 29
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-wide v4, p0, LC0/A;->m0:J

    .line 34
    .line 35
    and-long/2addr v4, v2

    .line 36
    long-to-int p2, v4

    .line 37
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    sub-float/2addr p1, p2

    .line 42
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    int-to-long v4, p2

    .line 47
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-long p1, p1

    .line 52
    shl-long v0, v4, v0

    .line 53
    .line 54
    and-long/2addr p1, v2

    .line 55
    or-long/2addr p1, v0

    .line 56
    iget-object v0, p0, LC0/A;->j0:[F

    .line 57
    .line 58
    invoke-static {v0, p1, p2}, Lj0/B;->o([FJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    return-wide p1
.end method

.method public final N(Landroid/view/MotionEvent;)I
    .locals 7

    .line 1
    iget-boolean v0, p0, LC0/A;->P0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, LC0/A;->P0:Z

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v2, p0, LC0/A;->x:LC0/I0;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v2, LC0/g1;->a:LP/f0;

    .line 18
    .line 19
    new-instance v3, Lv0/s;

    .line 20
    .line 21
    invoke-direct {v3, v0}, Lv0/s;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, LC0/A;->O:Lv0/c;

    .line 28
    .line 29
    invoke-virtual {v0, p0, p1}, Lv0/c;->a(LC0/A;Landroid/view/MotionEvent;)LZ/m;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, p0, LC0/A;->P:LL/s;

    .line 34
    .line 35
    if-eqz v2, :cond_8

    .line 36
    .line 37
    iget-object v1, v2, LZ/m;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/List;

    .line 40
    .line 41
    move-object v4, v1

    .line 42
    check-cast v4, Ljava/util/Collection;

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    add-int/lit8 v4, v4, -0x1

    .line 49
    .line 50
    if-ltz v4, :cond_3

    .line 51
    .line 52
    :goto_0
    add-int/lit8 v5, v4, -0x1

    .line 53
    .line 54
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    move-object v6, v4

    .line 59
    check-cast v6, Lv0/n;

    .line 60
    .line 61
    iget-boolean v6, v6, Lv0/n;->e:Z

    .line 62
    .line 63
    if-eqz v6, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    if-gez v5, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move v4, v5

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    :goto_1
    const/4 v4, 0x0

    .line 72
    :goto_2
    check-cast v4, Lv0/n;

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    iget-wide v4, v4, Lv0/n;->d:J

    .line 77
    .line 78
    iput-wide v4, p0, LC0/A;->q:J

    .line 79
    .line 80
    :cond_4
    invoke-virtual {p0, p1}, LC0/A;->w(Landroid/view/MotionEvent;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-virtual {v3, v2, p0, v1}, LL/s;->e(LZ/m;LC0/A;Z)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    const/4 v3, 0x5

    .line 95
    if-ne v2, v3, :cond_6

    .line 96
    .line 97
    :cond_5
    and-int/lit8 v2, v1, 0x1

    .line 98
    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    :cond_6
    return v1

    .line 102
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    iget-object v2, v0, Lv0/c;->c:Landroid/util/SparseBooleanArray;

    .line 111
    .line 112
    invoke-virtual {v2, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, Lv0/c;->b:Landroid/util/SparseLongArray;

    .line 116
    .line 117
    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    .line 118
    .line 119
    .line 120
    return v1

    .line 121
    :cond_8
    iget-boolean p1, v3, LL/s;->a:Z

    .line 122
    .line 123
    if-nez p1, :cond_9

    .line 124
    .line 125
    iget-object p1, v3, LL/s;->d:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Li3/a;

    .line 128
    .line 129
    iget-object p1, p1, Li3/a;->r:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, Lr/q;

    .line 132
    .line 133
    invoke-virtual {p1}, Lr/q;->a()V

    .line 134
    .line 135
    .line 136
    iget-object p1, v3, LL/s;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p1, LC0/H0;

    .line 139
    .line 140
    invoke-virtual {p1}, LC0/H0;->e()V

    .line 141
    .line 142
    .line 143
    :cond_9
    return v1
.end method

.method public final O(Landroid/view/MotionEvent;IJZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eq v2, v6, :cond_1

    .line 14
    .line 15
    const/4 v7, 0x6

    .line 16
    if-eq v2, v7, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/16 v2, 0x9

    .line 25
    .line 26
    if-eq v5, v2, :cond_2

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    if-eq v5, v2, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    :cond_2
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ltz v3, :cond_3

    .line 38
    .line 39
    move v7, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/4 v7, 0x0

    .line 42
    :goto_1
    sub-int/2addr v2, v7

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    return-void

    .line 46
    :cond_4
    new-array v7, v2, [Landroid/view/MotionEvent$PointerProperties;

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    :goto_2
    if-ge v8, v2, :cond_5

    .line 50
    .line 51
    new-instance v9, Landroid/view/MotionEvent$PointerProperties;

    .line 52
    .line 53
    invoke-direct {v9}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 54
    .line 55
    .line 56
    aput-object v9, v7, v8

    .line 57
    .line 58
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    new-array v8, v2, [Landroid/view/MotionEvent$PointerCoords;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    :goto_3
    if-ge v9, v2, :cond_6

    .line 65
    .line 66
    new-instance v10, Landroid/view/MotionEvent$PointerCoords;

    .line 67
    .line 68
    invoke-direct {v10}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 69
    .line 70
    .line 71
    aput-object v10, v8, v9

    .line 72
    .line 73
    add-int/lit8 v9, v9, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    const/4 v9, 0x0

    .line 77
    :goto_4
    if-ge v9, v2, :cond_9

    .line 78
    .line 79
    if-ltz v3, :cond_8

    .line 80
    .line 81
    if-ge v9, v3, :cond_7

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_7
    move v10, v6

    .line 85
    goto :goto_6

    .line 86
    :cond_8
    :goto_5
    const/4 v10, 0x0

    .line 87
    :goto_6
    add-int/2addr v10, v9

    .line 88
    aget-object v11, v7, v9

    .line 89
    .line 90
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 91
    .line 92
    .line 93
    aget-object v11, v8, v9

    .line 94
    .line 95
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 96
    .line 97
    .line 98
    iget v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 99
    .line 100
    iget v12, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 101
    .line 102
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    int-to-long v13, v10

    .line 107
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    int-to-long v4, v10

    .line 112
    const/16 v10, 0x20

    .line 113
    .line 114
    shl-long/2addr v13, v10

    .line 115
    const-wide v15, 0xffffffffL

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    and-long/2addr v4, v15

    .line 121
    or-long/2addr v4, v13

    .line 122
    invoke-virtual {v0, v4, v5}, LC0/A;->y(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    shr-long v13, v4, v10

    .line 127
    .line 128
    long-to-int v10, v13

    .line 129
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    iput v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 134
    .line 135
    and-long/2addr v4, v15

    .line 136
    long-to-int v4, v4

    .line 137
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    iput v4, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 142
    .line 143
    add-int/lit8 v9, v9, 0x1

    .line 144
    .line 145
    move/from16 v5, p2

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_9
    if-eqz p5, :cond_a

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    goto :goto_7

    .line 152
    :cond_a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    move v10, v4

    .line 157
    :goto_7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 158
    .line 159
    .line 160
    move-result-wide v3

    .line 161
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 162
    .line 163
    .line 164
    move-result-wide v11

    .line 165
    cmp-long v3, v3, v11

    .line 166
    .line 167
    if-nez v3, :cond_b

    .line 168
    .line 169
    move-wide/from16 v3, p3

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 173
    .line 174
    .line 175
    move-result-wide v3

    .line 176
    :goto_8
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getXPrecision()F

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getYPrecision()F

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getFlags()I

    .line 201
    .line 202
    .line 203
    move-result v16

    .line 204
    move/from16 v5, p2

    .line 205
    .line 206
    move v6, v2

    .line 207
    move-wide v1, v3

    .line 208
    move-wide/from16 v3, p3

    .line 209
    .line 210
    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iget-object v2, v0, LC0/A;->O:Lv0/c;

    .line 215
    .line 216
    invoke-virtual {v2, v0, v1}, Lv0/c;->a(LC0/A;Landroid/view/MotionEvent;)LZ/m;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iget-object v3, v0, LC0/A;->P:LL/s;

    .line 224
    .line 225
    const/4 v4, 0x1

    .line 226
    invoke-virtual {v3, v2, v0, v4}, LL/s;->e(LZ/m;LC0/A;Z)I

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final P()V
    .locals 13

    .line 1
    iget-object v0, p0, LC0/A;->h0:[I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, LC0/A;->g0:J

    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    shr-long v4, v1, v3

    .line 11
    .line 12
    long-to-int v4, v4

    .line 13
    const-wide v5, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr v1, v5

    .line 19
    long-to-int v1, v1

    .line 20
    const/4 v2, 0x0

    .line 21
    aget v7, v0, v2

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    if-ne v4, v7, :cond_0

    .line 25
    .line 26
    aget v9, v0, v8

    .line 27
    .line 28
    if-ne v1, v9, :cond_0

    .line 29
    .line 30
    iget-wide v9, p0, LC0/A;->k0:J

    .line 31
    .line 32
    const-wide/16 v11, 0x0

    .line 33
    .line 34
    cmp-long v9, v9, v11

    .line 35
    .line 36
    if-gez v9, :cond_1

    .line 37
    .line 38
    :cond_0
    aget v0, v0, v8

    .line 39
    .line 40
    int-to-long v9, v7

    .line 41
    shl-long/2addr v9, v3

    .line 42
    int-to-long v11, v0

    .line 43
    and-long/2addr v5, v11

    .line 44
    or-long/2addr v5, v9

    .line 45
    iput-wide v5, p0, LC0/A;->g0:J

    .line 46
    .line 47
    const v0, 0x7fffffff

    .line 48
    .line 49
    .line 50
    if-eq v4, v0, :cond_1

    .line 51
    .line 52
    if-eq v1, v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 59
    .line 60
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 61
    .line 62
    invoke-virtual {v0}, LB0/c0;->c0()V

    .line 63
    .line 64
    .line 65
    move v0, v8

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move v0, v2

    .line 68
    :goto_0
    invoke-virtual {p0}, LC0/A;->I()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, LC0/A;->getRectManager()LJ0/a;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-wide v3, p0, LC0/A;->g0:J

    .line 76
    .line 77
    iget-wide v5, p0, LC0/A;->m0:J

    .line 78
    .line 79
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/K1;->K(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v7, p0, LC0/A;->i0:[F

    .line 87
    .line 88
    invoke-static {v7}, Ln5/A;->i([F)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    iget-object v10, v1, LJ0/a;->b:LJ0/b;

    .line 93
    .line 94
    and-int/lit8 v9, v9, 0x2

    .line 95
    .line 96
    if-nez v9, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const/4 v7, 0x0

    .line 100
    :goto_1
    iget-wide v11, v10, LJ0/b;->c:J

    .line 101
    .line 102
    invoke-static {v5, v6, v11, v12}, LW0/i;->a(JJ)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-nez v9, :cond_3

    .line 107
    .line 108
    iput-wide v5, v10, LJ0/b;->c:J

    .line 109
    .line 110
    move v5, v8

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move v5, v2

    .line 113
    :goto_2
    iget-wide v11, v10, LJ0/b;->d:J

    .line 114
    .line 115
    invoke-static {v3, v4, v11, v12}, LW0/i;->a(JJ)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-nez v6, :cond_4

    .line 120
    .line 121
    iput-wide v3, v10, LJ0/b;->d:J

    .line 122
    .line 123
    move v5, v8

    .line 124
    :cond_4
    if-eqz v7, :cond_5

    .line 125
    .line 126
    move v5, v8

    .line 127
    :cond_5
    if-nez v5, :cond_6

    .line 128
    .line 129
    iget-boolean v3, v1, LJ0/a;->e:Z

    .line 130
    .line 131
    if-eqz v3, :cond_7

    .line 132
    .line 133
    :cond_6
    move v2, v8

    .line 134
    :cond_7
    iput-boolean v2, v1, LJ0/a;->e:Z

    .line 135
    .line 136
    iget-object v1, p0, LC0/A;->f0:LB0/a0;

    .line 137
    .line 138
    invoke-virtual {v1, v0}, LB0/a0;->a(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, LC0/A;->getRectManager()LJ0/a;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, LJ0/a;->a()V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0}, LC0/A;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 2

    .line 2
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    :cond_0
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 5
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 6
    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 p2, 0x1

    const/4 p3, -0x1

    .line 7
    invoke-virtual {p0, p1, p3, v0, p2}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, p1, v0, p2, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final autofill(Landroid/util/SparseArray;)V
    .locals 7

    .line 1
    invoke-static {}, LC0/A;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iget-object v1, p0, LC0/A;->S:Ld0/b;

    .line 9
    .line 10
    if-eqz v1, :cond_5

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    move v3, v0

    .line 17
    :goto_0
    if-ge v3, v2, :cond_5

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {p1, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v5}, Lcom/google/firebase/c;->e(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-static {v5}, Lcom/google/firebase/c;->D(Landroid/view/autofill/AutofillValue;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    iget-object v6, v1, Ld0/b;->b:LI0/n;

    .line 38
    .line 39
    iget-object v6, v6, LI0/n;->c:Lr/k;

    .line 40
    .line 41
    invoke-virtual {v6, v4}, Lr/k;->b(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, LB0/L;

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    invoke-virtual {v4}, LB0/L;->u()LI0/i;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_4

    .line 54
    .line 55
    sget-object v6, LI0/h;->g:LI0/s;

    .line 56
    .line 57
    iget-object v4, v4, LI0/i;->q:Lr/G;

    .line 58
    .line 59
    invoke-virtual {v4, v6}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-nez v4, :cond_0

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    :cond_0
    check-cast v4, LI0/a;

    .line 67
    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    iget-object v4, v4, LI0/a;->b:Lm5/e;

    .line 71
    .line 72
    check-cast v4, LB5/c;

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    new-instance v6, LL0/d;

    .line 77
    .line 78
    invoke-static {v5}, Lcom/google/firebase/c;->g(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-direct {v6, v5}, LL0/d;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v4, v6}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Ljava/lang/Boolean;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    invoke-static {v5}, Lcom/google/firebase/c;->y(Landroid/view/autofill/AutofillValue;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const-string v6, "ComposeAutofillManager"

    .line 101
    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    const-string v4, "Auto filling Date fields is not yet supported."

    .line 105
    .line 106
    invoke-static {v6, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    invoke-static {v5}, Lcom/google/firebase/c;->C(Landroid/view/autofill/AutofillValue;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_3

    .line 115
    .line 116
    const-string v4, "Auto filling dropdown lists is not yet supported."

    .line 117
    .line 118
    invoke-static {v6, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-static {v5}, Lcom/google/firebase/c;->B(Landroid/view/autofill/AutofillValue;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_4

    .line 127
    .line 128
    const-string v4, "Auto filling toggle fields are not yet supported."

    .line 129
    .line 130
    invoke-static {v6, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_5
    iget-object v1, p0, LC0/A;->R:LE/c0;

    .line 137
    .line 138
    if-eqz v1, :cond_c

    .line 139
    .line 140
    iget-object v1, v1, LE/c0;->r:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ld0/h;

    .line 143
    .line 144
    iget-object v2, v1, Ld0/h;->a:Ljava/util/LinkedHashMap;

    .line 145
    .line 146
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    :goto_2
    if-ge v0, v2, :cond_c

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v4}, Lcom/google/firebase/c;->e(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-static {v4}, Lcom/google/firebase/c;->D(Landroid/view/autofill/AutofillValue;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_8

    .line 176
    .line 177
    invoke-static {v4}, Lcom/google/firebase/c;->g(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    iget-object v4, v1, Ld0/h;->a:Ljava/util/LinkedHashMap;

    .line 185
    .line 186
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    if-nez v3, :cond_7

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 198
    .line 199
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 200
    .line 201
    .line 202
    throw p1

    .line 203
    :cond_8
    invoke-static {v4}, Lcom/google/firebase/c;->y(Landroid/view/autofill/AutofillValue;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-nez v3, :cond_b

    .line 208
    .line 209
    invoke-static {v4}, Lcom/google/firebase/c;->C(Landroid/view/autofill/AutofillValue;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_a

    .line 214
    .line 215
    invoke-static {v4}, Lcom/google/firebase/c;->B(Landroid/view/autofill/AutofillValue;)Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-nez v3, :cond_9

    .line 220
    .line 221
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_9
    new-instance p1, LA5/a;

    .line 225
    .line 226
    const-string v0, "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"

    .line 227
    .line 228
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw p1

    .line 232
    :cond_a
    new-instance p1, LA5/a;

    .line 233
    .line 234
    const-string v0, "An operation is not implemented: b/138604541: Add onFill() callback for list"

    .line 235
    .line 236
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw p1

    .line 240
    :cond_b
    new-instance p1, LA5/a;

    .line 241
    .line 242
    const-string v0, "An operation is not implemented: b/138604541: Add onFill() callback for date"

    .line 243
    .line 244
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw p1

    .line 248
    :cond_c
    :goto_4
    return-void
.end method

.method public final b(Landroidx/lifecycle/x;)V
    .locals 0

    .line 1
    invoke-static {}, LC0/E0;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, LC0/A;->setShowLayoutBounds(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-wide v1, p0, LC0/A;->q:J

    .line 3
    .line 4
    iget-object v3, p0, LC0/A;->F:LC0/I;

    .line 5
    .line 6
    invoke-virtual {v3, v0, p1, v1, v2}, LC0/I;->m(ZIJ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final canScrollVertically(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-wide v1, p0, LC0/A;->q:J

    .line 3
    .line 4
    iget-object v3, p0, LC0/A;->F:LC0/I;

    .line 5
    .line 6
    invoke-virtual {v3, v0, p1, v1, v2}, LC0/I;->m(ZIJ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LC0/A;->s(LB0/L;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, LC0/A;->z(Z)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, La0/n;->k()La0/h;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, La0/h;->m()V

    .line 23
    .line 24
    .line 25
    iput-boolean v0, p0, LC0/A;->M:Z

    .line 26
    .line 27
    iget-object v0, p0, LC0/A;->y:Lj0/n;

    .line 28
    .line 29
    iget-object v1, v0, Lj0/n;->a:Lj0/b;

    .line 30
    .line 31
    iget-object v2, v1, Lj0/b;->a:Landroid/graphics/Canvas;

    .line 32
    .line 33
    iput-object p1, v1, Lj0/b;->a:Landroid/graphics/Canvas;

    .line 34
    .line 35
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v3, v1, v4}, LB0/L;->j(Lj0/m;Lm0/c;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lj0/n;->a:Lj0/b;

    .line 44
    .line 45
    iput-object v2, v0, Lj0/b;->a:Landroid/graphics/Canvas;

    .line 46
    .line 47
    iget-object v0, p0, LC0/A;->K:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x0

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    move v3, v2

    .line 61
    :goto_0
    if-ge v3, v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, LB0/s0;

    .line 68
    .line 69
    invoke-interface {v4}, LB0/s0;->e()V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    sget-boolean v1, LC0/d1;->J:Z

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-virtual {p1, v3, v3, v3, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 85
    .line 86
    .line 87
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    .line 95
    .line 96
    iput-boolean v2, p0, LC0/A;->M:Z

    .line 97
    .line 98
    iget-object p1, p0, LC0/A;->L:Ljava/util/ArrayList;

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 106
    .line 107
    .line 108
    :cond_3
    invoke-virtual {p0}, LC0/A;->getRectManager()LJ0/a;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, LJ0/a;->a()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    .line 1
    iget-boolean v0, p0, LC0/A;->M0:Z

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, LC0/A;->L0:LC0/m;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ne v3, v1, :cond_0

    .line 18
    .line 19
    iput-boolean v2, p0, LC0/A;->M0:Z

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, LC0/m;->run()V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne v0, v1, :cond_36

    .line 30
    .line 31
    invoke-static {p1}, LC0/A;->u(Landroid/view/MotionEvent;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_35

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto/16 :goto_1c

    .line 44
    .line 45
    :cond_2
    const/high16 v0, 0x400000

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x1

    .line 52
    if-eqz v0, :cond_33

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const/16 v3, 0x1a

    .line 63
    .line 64
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    if-lt v5, v3, :cond_3

    .line 74
    .line 75
    sget-object v4, Lw1/L;->a:Ljava/lang/reflect/Method;

    .line 76
    .line 77
    invoke-static {v0}, LE0/d;->d(Landroid/view/ViewConfiguration;)F

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-static {v0, v4}, Lw1/L;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-lt v5, v3, :cond_4

    .line 89
    .line 90
    invoke-static {v0}, LE0/d;->c(Landroid/view/ViewConfiguration;)F

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-static {v0, v4}, Lw1/L;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 95
    .line 96
    .line 97
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    new-instance v3, LB0/K;

    .line 108
    .line 109
    const/4 v4, 0x4

    .line 110
    invoke-direct {v3, v4, p0, p1}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    check-cast v0, Lh0/h;

    .line 114
    .line 115
    iget-object p1, v0, Lh0/h;->e:Lh0/e;

    .line 116
    .line 117
    iget-boolean p1, p1, Lh0/e;->f:Z

    .line 118
    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    const-string p1, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    .line 122
    .line 123
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return v2

    .line 129
    :cond_5
    iget-object p1, v0, Lh0/h;->d:Lh0/o;

    .line 130
    .line 131
    invoke-static {p1}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    const-string v0, "visitAncestors called on an unattached node"

    .line 136
    .line 137
    const/16 v4, 0x10

    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    if-eqz p1, :cond_12

    .line 141
    .line 142
    iget-object v6, p1, Lc0/l;->q:Lc0/l;

    .line 143
    .line 144
    iget-boolean v6, v6, Lc0/l;->D:Z

    .line 145
    .line 146
    if-nez v6, :cond_6

    .line 147
    .line 148
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_6
    iget-object v6, p1, Lc0/l;->q:Lc0/l;

    .line 152
    .line 153
    invoke-static {p1}, LB0/g;->u(LB0/m;)LB0/L;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    :goto_3
    if-eqz p1, :cond_11

    .line 158
    .line 159
    iget-object v7, p1, LB0/L;->U:LB0/g0;

    .line 160
    .line 161
    iget-object v7, v7, LB0/g0;->e:Lc0/l;

    .line 162
    .line 163
    iget v7, v7, Lc0/l;->t:I

    .line 164
    .line 165
    and-int/lit16 v7, v7, 0x4000

    .line 166
    .line 167
    if-eqz v7, :cond_f

    .line 168
    .line 169
    :goto_4
    if-eqz v6, :cond_f

    .line 170
    .line 171
    iget v7, v6, Lc0/l;->s:I

    .line 172
    .line 173
    and-int/lit16 v7, v7, 0x4000

    .line 174
    .line 175
    if-eqz v7, :cond_e

    .line 176
    .line 177
    move-object v8, v5

    .line 178
    move-object v7, v6

    .line 179
    :goto_5
    if-eqz v7, :cond_e

    .line 180
    .line 181
    instance-of v9, v7, Lx0/a;

    .line 182
    .line 183
    if-eqz v9, :cond_7

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_7
    iget v9, v7, Lc0/l;->s:I

    .line 187
    .line 188
    and-int/lit16 v9, v9, 0x4000

    .line 189
    .line 190
    if-eqz v9, :cond_d

    .line 191
    .line 192
    instance-of v9, v7, LB0/n;

    .line 193
    .line 194
    if-eqz v9, :cond_d

    .line 195
    .line 196
    move-object v9, v7

    .line 197
    check-cast v9, LB0/n;

    .line 198
    .line 199
    iget-object v9, v9, LB0/n;->F:Lc0/l;

    .line 200
    .line 201
    move v10, v2

    .line 202
    :goto_6
    if-eqz v9, :cond_c

    .line 203
    .line 204
    iget v11, v9, Lc0/l;->s:I

    .line 205
    .line 206
    and-int/lit16 v11, v11, 0x4000

    .line 207
    .line 208
    if-eqz v11, :cond_b

    .line 209
    .line 210
    add-int/lit8 v10, v10, 0x1

    .line 211
    .line 212
    if-ne v10, v1, :cond_8

    .line 213
    .line 214
    move-object v7, v9

    .line 215
    goto :goto_7

    .line 216
    :cond_8
    if-nez v8, :cond_9

    .line 217
    .line 218
    new-instance v8, LR/e;

    .line 219
    .line 220
    new-array v11, v4, [Lc0/l;

    .line 221
    .line 222
    invoke-direct {v8, v11}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_9
    if-eqz v7, :cond_a

    .line 226
    .line 227
    invoke-virtual {v8, v7}, LR/e;->c(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    move-object v7, v5

    .line 231
    :cond_a
    invoke-virtual {v8, v9}, LR/e;->c(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_b
    :goto_7
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_c
    if-ne v10, v1, :cond_d

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_d
    invoke-static {v8}, LB0/g;->f(LR/e;)Lc0/l;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    goto :goto_5

    .line 245
    :cond_e
    iget-object v6, v6, Lc0/l;->u:Lc0/l;

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_f
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-eqz p1, :cond_10

    .line 253
    .line 254
    iget-object v6, p1, LB0/L;->U:LB0/g0;

    .line 255
    .line 256
    if-eqz v6, :cond_10

    .line 257
    .line 258
    iget-object v6, v6, LB0/g0;->d:LB0/B0;

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_10
    move-object v6, v5

    .line 262
    goto :goto_3

    .line 263
    :cond_11
    move-object v7, v5

    .line 264
    :goto_8
    check-cast v7, Lx0/a;

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_12
    move-object v7, v5

    .line 268
    :goto_9
    if-eqz v7, :cond_34

    .line 269
    .line 270
    move-object p1, v7

    .line 271
    check-cast p1, Lc0/l;

    .line 272
    .line 273
    iget-object v6, p1, Lc0/l;->q:Lc0/l;

    .line 274
    .line 275
    iget-boolean v6, v6, Lc0/l;->D:Z

    .line 276
    .line 277
    if-nez v6, :cond_13

    .line 278
    .line 279
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :cond_13
    iget-object v0, p1, Lc0/l;->q:Lc0/l;

    .line 283
    .line 284
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 285
    .line 286
    invoke-static {v7}, LB0/g;->u(LB0/m;)LB0/L;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    move-object v7, v5

    .line 291
    :goto_a
    if-eqz v6, :cond_1f

    .line 292
    .line 293
    iget-object v8, v6, LB0/L;->U:LB0/g0;

    .line 294
    .line 295
    iget-object v8, v8, LB0/g0;->e:Lc0/l;

    .line 296
    .line 297
    iget v8, v8, Lc0/l;->t:I

    .line 298
    .line 299
    and-int/lit16 v8, v8, 0x4000

    .line 300
    .line 301
    if-eqz v8, :cond_1d

    .line 302
    .line 303
    :goto_b
    if-eqz v0, :cond_1d

    .line 304
    .line 305
    iget v8, v0, Lc0/l;->s:I

    .line 306
    .line 307
    and-int/lit16 v8, v8, 0x4000

    .line 308
    .line 309
    if-eqz v8, :cond_1c

    .line 310
    .line 311
    move-object v8, v0

    .line 312
    move-object v9, v5

    .line 313
    :goto_c
    if-eqz v8, :cond_1c

    .line 314
    .line 315
    instance-of v10, v8, Lx0/a;

    .line 316
    .line 317
    if-eqz v10, :cond_15

    .line 318
    .line 319
    if-nez v7, :cond_14

    .line 320
    .line 321
    new-instance v7, Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 324
    .line 325
    .line 326
    :cond_14
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_f

    .line 330
    :cond_15
    iget v10, v8, Lc0/l;->s:I

    .line 331
    .line 332
    and-int/lit16 v10, v10, 0x4000

    .line 333
    .line 334
    if-eqz v10, :cond_1b

    .line 335
    .line 336
    instance-of v10, v8, LB0/n;

    .line 337
    .line 338
    if-eqz v10, :cond_1b

    .line 339
    .line 340
    move-object v10, v8

    .line 341
    check-cast v10, LB0/n;

    .line 342
    .line 343
    iget-object v10, v10, LB0/n;->F:Lc0/l;

    .line 344
    .line 345
    move v11, v2

    .line 346
    :goto_d
    if-eqz v10, :cond_1a

    .line 347
    .line 348
    iget v12, v10, Lc0/l;->s:I

    .line 349
    .line 350
    and-int/lit16 v12, v12, 0x4000

    .line 351
    .line 352
    if-eqz v12, :cond_19

    .line 353
    .line 354
    add-int/lit8 v11, v11, 0x1

    .line 355
    .line 356
    if-ne v11, v1, :cond_16

    .line 357
    .line 358
    move-object v8, v10

    .line 359
    goto :goto_e

    .line 360
    :cond_16
    if-nez v9, :cond_17

    .line 361
    .line 362
    new-instance v9, LR/e;

    .line 363
    .line 364
    new-array v12, v4, [Lc0/l;

    .line 365
    .line 366
    invoke-direct {v9, v12}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :cond_17
    if-eqz v8, :cond_18

    .line 370
    .line 371
    invoke-virtual {v9, v8}, LR/e;->c(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    move-object v8, v5

    .line 375
    :cond_18
    invoke-virtual {v9, v10}, LR/e;->c(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :cond_19
    :goto_e
    iget-object v10, v10, Lc0/l;->v:Lc0/l;

    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_1a
    if-ne v11, v1, :cond_1b

    .line 382
    .line 383
    goto :goto_c

    .line 384
    :cond_1b
    :goto_f
    invoke-static {v9}, LB0/g;->f(LR/e;)Lc0/l;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    goto :goto_c

    .line 389
    :cond_1c
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_1d
    invoke-virtual {v6}, LB0/L;->s()LB0/L;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    if-eqz v6, :cond_1e

    .line 397
    .line 398
    iget-object v0, v6, LB0/L;->U:LB0/g0;

    .line 399
    .line 400
    if-eqz v0, :cond_1e

    .line 401
    .line 402
    iget-object v0, v0, LB0/g0;->d:LB0/B0;

    .line 403
    .line 404
    goto :goto_a

    .line 405
    :cond_1e
    move-object v0, v5

    .line 406
    goto :goto_a

    .line 407
    :cond_1f
    if-eqz v7, :cond_21

    .line 408
    .line 409
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    add-int/lit8 v0, v0, -0x1

    .line 414
    .line 415
    if-ltz v0, :cond_21

    .line 416
    .line 417
    :goto_10
    add-int/lit8 v6, v0, -0x1

    .line 418
    .line 419
    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, Lx0/a;

    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    if-gez v6, :cond_20

    .line 429
    .line 430
    goto :goto_11

    .line 431
    :cond_20
    move v0, v6

    .line 432
    goto :goto_10

    .line 433
    :cond_21
    :goto_11
    iget-object v0, p1, Lc0/l;->q:Lc0/l;

    .line 434
    .line 435
    move-object v6, v5

    .line 436
    :goto_12
    if-eqz v0, :cond_29

    .line 437
    .line 438
    instance-of v8, v0, Lx0/a;

    .line 439
    .line 440
    if-eqz v8, :cond_22

    .line 441
    .line 442
    check-cast v0, Lx0/a;

    .line 443
    .line 444
    goto :goto_15

    .line 445
    :cond_22
    iget v8, v0, Lc0/l;->s:I

    .line 446
    .line 447
    and-int/lit16 v8, v8, 0x4000

    .line 448
    .line 449
    if-eqz v8, :cond_28

    .line 450
    .line 451
    instance-of v8, v0, LB0/n;

    .line 452
    .line 453
    if-eqz v8, :cond_28

    .line 454
    .line 455
    move-object v8, v0

    .line 456
    check-cast v8, LB0/n;

    .line 457
    .line 458
    iget-object v8, v8, LB0/n;->F:Lc0/l;

    .line 459
    .line 460
    move v9, v2

    .line 461
    :goto_13
    if-eqz v8, :cond_27

    .line 462
    .line 463
    iget v10, v8, Lc0/l;->s:I

    .line 464
    .line 465
    and-int/lit16 v10, v10, 0x4000

    .line 466
    .line 467
    if-eqz v10, :cond_26

    .line 468
    .line 469
    add-int/lit8 v9, v9, 0x1

    .line 470
    .line 471
    if-ne v9, v1, :cond_23

    .line 472
    .line 473
    move-object v0, v8

    .line 474
    goto :goto_14

    .line 475
    :cond_23
    if-nez v6, :cond_24

    .line 476
    .line 477
    new-instance v6, LR/e;

    .line 478
    .line 479
    new-array v10, v4, [Lc0/l;

    .line 480
    .line 481
    invoke-direct {v6, v10}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    :cond_24
    if-eqz v0, :cond_25

    .line 485
    .line 486
    invoke-virtual {v6, v0}, LR/e;->c(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    move-object v0, v5

    .line 490
    :cond_25
    invoke-virtual {v6, v8}, LR/e;->c(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    :cond_26
    :goto_14
    iget-object v8, v8, Lc0/l;->v:Lc0/l;

    .line 494
    .line 495
    goto :goto_13

    .line 496
    :cond_27
    if-ne v9, v1, :cond_28

    .line 497
    .line 498
    goto :goto_12

    .line 499
    :cond_28
    :goto_15
    invoke-static {v6}, LB0/g;->f(LR/e;)Lc0/l;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    goto :goto_12

    .line 504
    :cond_29
    invoke-virtual {v3}, LB0/K;->invoke()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    check-cast v0, Ljava/lang/Boolean;

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-eqz v0, :cond_2a

    .line 515
    .line 516
    goto/16 :goto_1b

    .line 517
    .line 518
    :cond_2a
    iget-object p1, p1, Lc0/l;->q:Lc0/l;

    .line 519
    .line 520
    move-object v0, v5

    .line 521
    :goto_16
    if-eqz p1, :cond_32

    .line 522
    .line 523
    instance-of v3, p1, Lx0/a;

    .line 524
    .line 525
    if-eqz v3, :cond_2b

    .line 526
    .line 527
    check-cast p1, Lx0/a;

    .line 528
    .line 529
    goto :goto_19

    .line 530
    :cond_2b
    iget v3, p1, Lc0/l;->s:I

    .line 531
    .line 532
    and-int/lit16 v3, v3, 0x4000

    .line 533
    .line 534
    if-eqz v3, :cond_31

    .line 535
    .line 536
    instance-of v3, p1, LB0/n;

    .line 537
    .line 538
    if-eqz v3, :cond_31

    .line 539
    .line 540
    move-object v3, p1

    .line 541
    check-cast v3, LB0/n;

    .line 542
    .line 543
    iget-object v3, v3, LB0/n;->F:Lc0/l;

    .line 544
    .line 545
    move v6, v2

    .line 546
    :goto_17
    if-eqz v3, :cond_30

    .line 547
    .line 548
    iget v8, v3, Lc0/l;->s:I

    .line 549
    .line 550
    and-int/lit16 v8, v8, 0x4000

    .line 551
    .line 552
    if-eqz v8, :cond_2f

    .line 553
    .line 554
    add-int/lit8 v6, v6, 0x1

    .line 555
    .line 556
    if-ne v6, v1, :cond_2c

    .line 557
    .line 558
    move-object p1, v3

    .line 559
    goto :goto_18

    .line 560
    :cond_2c
    if-nez v0, :cond_2d

    .line 561
    .line 562
    new-instance v0, LR/e;

    .line 563
    .line 564
    new-array v8, v4, [Lc0/l;

    .line 565
    .line 566
    invoke-direct {v0, v8}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    :cond_2d
    if-eqz p1, :cond_2e

    .line 570
    .line 571
    invoke-virtual {v0, p1}, LR/e;->c(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    move-object p1, v5

    .line 575
    :cond_2e
    invoke-virtual {v0, v3}, LR/e;->c(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    :cond_2f
    :goto_18
    iget-object v3, v3, Lc0/l;->v:Lc0/l;

    .line 579
    .line 580
    goto :goto_17

    .line 581
    :cond_30
    if-ne v6, v1, :cond_31

    .line 582
    .line 583
    goto :goto_16

    .line 584
    :cond_31
    :goto_19
    invoke-static {v0}, LB0/g;->f(LR/e;)Lc0/l;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    goto :goto_16

    .line 589
    :cond_32
    if-eqz v7, :cond_34

    .line 590
    .line 591
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 592
    .line 593
    .line 594
    move-result p1

    .line 595
    move v0, v2

    .line 596
    :goto_1a
    if-ge v0, p1, :cond_34

    .line 597
    .line 598
    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    check-cast v1, Lx0/a;

    .line 603
    .line 604
    iget-object v1, v1, Lx0/a;->E:LC0/p;

    .line 605
    .line 606
    add-int/lit8 v0, v0, 0x1

    .line 607
    .line 608
    goto :goto_1a

    .line 609
    :cond_33
    invoke-virtual {p0, p1}, LC0/A;->r(Landroid/view/MotionEvent;)I

    .line 610
    .line 611
    .line 612
    move-result p1

    .line 613
    and-int/2addr p1, v1

    .line 614
    if-eqz p1, :cond_34

    .line 615
    .line 616
    :goto_1b
    return v1

    .line 617
    :cond_34
    return v2

    .line 618
    :cond_35
    :goto_1c
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 619
    .line 620
    .line 621
    move-result p1

    .line 622
    return p1

    .line 623
    :cond_36
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 624
    .line 625
    .line 626
    move-result p1

    .line 627
    return p1
.end method

.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, LC0/A;->M0:Z

    .line 6
    .line 7
    iget-object v3, v0, LC0/A;->L0:LC0/m;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, LC0/m;->run()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {v1}, LC0/A;->u(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v4, 0x0

    .line 22
    if-nez v2, :cond_12

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_1
    iget-object v2, v0, LC0/A;->F:LC0/I;

    .line 33
    .line 34
    iget-object v5, v2, LC0/I;->d:LC0/A;

    .line 35
    .line 36
    iget-object v6, v2, LC0/I;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/16 v8, 0xa

    .line 43
    .line 44
    const/4 v9, 0x7

    .line 45
    const/4 v10, 0x1

    .line 46
    if-eqz v7, :cond_c

    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_c

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/16 v7, 0x100

    .line 59
    .line 60
    const/16 v11, 0x80

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    const/16 v13, 0xc

    .line 64
    .line 65
    const/high16 v14, -0x80000000

    .line 66
    .line 67
    if-eq v6, v9, :cond_5

    .line 68
    .line 69
    const/16 v15, 0x9

    .line 70
    .line 71
    if-eq v6, v15, :cond_5

    .line 72
    .line 73
    if-eq v6, v8, :cond_2

    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_2
    iget v6, v2, LC0/I;->e:I

    .line 78
    .line 79
    if-eq v6, v14, :cond_4

    .line 80
    .line 81
    if-ne v6, v14, :cond_3

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_3
    iput v14, v2, LC0/I;->e:I

    .line 86
    .line 87
    invoke-static {v2, v14, v11, v12, v13}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v6, v7, v12, v13}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_3

    .line 94
    .line 95
    :cond_4
    invoke-virtual {v5}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 100
    .line 101
    .line 102
    goto/16 :goto_3

    .line 103
    .line 104
    :cond_5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    invoke-virtual {v5, v10}, LC0/A;->z(Z)V

    .line 113
    .line 114
    .line 115
    new-instance v20, LB0/t;

    .line 116
    .line 117
    invoke-direct/range {v20 .. v20}, LB0/t;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, LC0/A;->getRoot()LB0/L;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    int-to-long v8, v6

    .line 129
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    move-wide/from16 v16, v8

    .line 134
    .line 135
    int-to-long v7, v6

    .line 136
    const/16 v6, 0x20

    .line 137
    .line 138
    shl-long v16, v16, v6

    .line 139
    .line 140
    const-wide v18, 0xffffffffL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    and-long v6, v7, v18

    .line 146
    .line 147
    or-long v6, v16, v6

    .line 148
    .line 149
    iget-object v8, v14, LB0/L;->U:LB0/g0;

    .line 150
    .line 151
    iget-object v9, v8, LB0/g0;->c:LB0/n0;

    .line 152
    .line 153
    sget-object v14, LB0/n0;->W:Lj0/C;

    .line 154
    .line 155
    invoke-virtual {v9, v6, v7}, LB0/n0;->x0(J)J

    .line 156
    .line 157
    .line 158
    move-result-wide v18

    .line 159
    iget-object v6, v8, LB0/g0;->c:LB0/n0;

    .line 160
    .line 161
    sget-object v17, LB0/n0;->Z:LB0/e;

    .line 162
    .line 163
    const/16 v21, 0x1

    .line 164
    .line 165
    const/16 v22, 0x1

    .line 166
    .line 167
    move-object/from16 v16, v6

    .line 168
    .line 169
    invoke-virtual/range {v16 .. v22}, LB0/n0;->G0(LB0/e;JLB0/t;IZ)V

    .line 170
    .line 171
    .line 172
    move-object/from16 v6, v20

    .line 173
    .line 174
    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    :goto_0
    const/4 v8, -0x1

    .line 179
    if-ge v8, v7, :cond_6

    .line 180
    .line 181
    iget-object v8, v6, LB0/t;->q:Lr/C;

    .line 182
    .line 183
    invoke-virtual {v8, v7}, Lr/C;->e(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    .line 188
    .line 189
    invoke-static {v8, v9}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    check-cast v8, Lc0/l;

    .line 193
    .line 194
    invoke-static {v8}, LB0/g;->u(LB0/m;)LB0/L;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-virtual {v5}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-virtual {v9}, LC0/k0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    check-cast v9, LZ0/j;

    .line 211
    .line 212
    if-eqz v9, :cond_7

    .line 213
    .line 214
    :cond_6
    const/high16 v14, -0x80000000

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_7
    iget-object v9, v8, LB0/L;->U:LB0/g0;

    .line 218
    .line 219
    const/16 v14, 0x8

    .line 220
    .line 221
    invoke-virtual {v9, v14}, LB0/g0;->d(I)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-nez v9, :cond_8

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_8
    iget v9, v8, LB0/L;->r:I

    .line 229
    .line 230
    invoke-virtual {v2, v9}, LC0/I;->z(I)I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    invoke-static {v8, v4}, La/a;->a(LB0/L;Z)LI0/m;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-static {v8}, LC0/W;->k(LI0/m;)Z

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    if-nez v14, :cond_9

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_9
    invoke-virtual {v8}, LI0/m;->i()LI0/i;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    sget-object v14, LI0/p;->x:LI0/s;

    .line 250
    .line 251
    iget-object v8, v8, LI0/i;->q:Lr/G;

    .line 252
    .line 253
    invoke-virtual {v8, v14}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    if-eqz v8, :cond_a

    .line 258
    .line 259
    :goto_1
    add-int/lit8 v7, v7, -0x1

    .line 260
    .line 261
    goto :goto_0

    .line 262
    :cond_a
    move v14, v9

    .line 263
    :goto_2
    invoke-virtual {v5}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-virtual {v5, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 268
    .line 269
    .line 270
    iget v5, v2, LC0/I;->e:I

    .line 271
    .line 272
    if-ne v5, v14, :cond_b

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_b
    iput v14, v2, LC0/I;->e:I

    .line 276
    .line 277
    invoke-static {v2, v14, v11, v12, v13}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 278
    .line 279
    .line 280
    const/16 v15, 0x100

    .line 281
    .line 282
    invoke-static {v2, v5, v15, v12, v13}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 283
    .line 284
    .line 285
    :cond_c
    :goto_3
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    const/4 v5, 0x7

    .line 290
    if-eq v2, v5, :cond_10

    .line 291
    .line 292
    const/16 v5, 0xa

    .line 293
    .line 294
    if-eq v2, v5, :cond_d

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_d
    invoke-virtual/range {p0 .. p1}, LC0/A;->w(Landroid/view/MotionEvent;)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_11

    .line 302
    .line 303
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    const/4 v5, 0x3

    .line 308
    if-ne v2, v5, :cond_e

    .line 309
    .line 310
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_e

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_e
    iget-object v2, v0, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 318
    .line 319
    if-eqz v2, :cond_f

    .line 320
    .line 321
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 322
    .line 323
    .line 324
    :cond_f
    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    iput-object v1, v0, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 329
    .line 330
    iput-boolean v10, v0, LC0/A;->M0:Z

    .line 331
    .line 332
    const-wide/16 v1, 0x8

    .line 333
    .line 334
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 335
    .line 336
    .line 337
    return v4

    .line 338
    :cond_10
    invoke-virtual/range {p0 .. p1}, LC0/A;->x(Landroid/view/MotionEvent;)Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-nez v2, :cond_11

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_11
    :goto_4
    invoke-virtual/range {p0 .. p1}, LC0/A;->r(Landroid/view/MotionEvent;)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    and-int/2addr v1, v10

    .line 350
    if-eqz v1, :cond_12

    .line 351
    .line 352
    return v10

    .line 353
    :cond_12
    :goto_5
    return v4
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, LC0/A;->x:LC0/I0;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v1, LC0/g1;->a:LP/f0;

    .line 17
    .line 18
    new-instance v2, Lv0/s;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Lv0/s;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Lh0/f;->q:Lh0/f;

    .line 31
    .line 32
    check-cast v0, Lh0/h;

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Lh0/h;->c(Landroid/view/KeyEvent;LB5/a;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    return p1

    .line 49
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_2
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, LB0/K;

    .line 56
    .line 57
    const/4 v2, 0x3

    .line 58
    invoke-direct {v1, v2, p0, p1}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast v0, Lh0/h;

    .line 62
    .line 63
    invoke-virtual {v0, p1, v1}, Lh0/h;->c(Landroid/view/KeyEvent;LB5/a;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public final dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lh0/h;

    .line 14
    .line 15
    iget-object v3, v0, Lh0/h;->e:Lh0/e;

    .line 16
    .line 17
    iget-boolean v3, v3, Lh0/e;->f:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const-string v0, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    .line 22
    .line 23
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    iget-object v0, v0, Lh0/h;->d:Lh0/o;

    .line 31
    .line 32
    invoke-static {v0}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_b

    .line 37
    .line 38
    iget-object v3, v0, Lc0/l;->q:Lc0/l;

    .line 39
    .line 40
    iget-boolean v3, v3, Lc0/l;->D:Z

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    const-string v3, "visitAncestors called on an unattached node"

    .line 45
    .line 46
    invoke-static {v3}, Ly0/a;->b(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v3, v0, Lc0/l;->q:Lc0/l;

    .line 50
    .line 51
    invoke-static {v0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    if-eqz v0, :cond_b

    .line 56
    .line 57
    iget-object v4, v0, LB0/L;->U:LB0/g0;

    .line 58
    .line 59
    iget-object v4, v4, LB0/g0;->e:Lc0/l;

    .line 60
    .line 61
    iget v4, v4, Lc0/l;->t:I

    .line 62
    .line 63
    const/high16 v5, 0x20000

    .line 64
    .line 65
    and-int/2addr v4, v5

    .line 66
    const/4 v6, 0x0

    .line 67
    if-eqz v4, :cond_9

    .line 68
    .line 69
    :goto_1
    if-eqz v3, :cond_9

    .line 70
    .line 71
    iget v4, v3, Lc0/l;->s:I

    .line 72
    .line 73
    and-int/2addr v4, v5

    .line 74
    if-eqz v4, :cond_8

    .line 75
    .line 76
    move-object v4, v3

    .line 77
    move-object v7, v6

    .line 78
    :goto_2
    if-eqz v4, :cond_8

    .line 79
    .line 80
    iget v8, v4, Lc0/l;->s:I

    .line 81
    .line 82
    and-int/2addr v8, v5

    .line 83
    if-eqz v8, :cond_7

    .line 84
    .line 85
    instance-of v8, v4, LB0/n;

    .line 86
    .line 87
    if-eqz v8, :cond_7

    .line 88
    .line 89
    move-object v8, v4

    .line 90
    check-cast v8, LB0/n;

    .line 91
    .line 92
    iget-object v8, v8, LB0/n;->F:Lc0/l;

    .line 93
    .line 94
    move v9, v1

    .line 95
    :goto_3
    if-eqz v8, :cond_6

    .line 96
    .line 97
    iget v10, v8, Lc0/l;->s:I

    .line 98
    .line 99
    and-int/2addr v10, v5

    .line 100
    if-eqz v10, :cond_5

    .line 101
    .line 102
    add-int/lit8 v9, v9, 0x1

    .line 103
    .line 104
    if-ne v9, v2, :cond_2

    .line 105
    .line 106
    move-object v4, v8

    .line 107
    goto :goto_4

    .line 108
    :cond_2
    if-nez v7, :cond_3

    .line 109
    .line 110
    new-instance v7, LR/e;

    .line 111
    .line 112
    const/16 v10, 0x10

    .line 113
    .line 114
    new-array v10, v10, [Lc0/l;

    .line 115
    .line 116
    invoke-direct {v7, v10}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    if-eqz v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v7, v4}, LR/e;->c(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v4, v6

    .line 125
    :cond_4
    invoke-virtual {v7, v8}, LR/e;->c(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_4
    iget-object v8, v8, Lc0/l;->v:Lc0/l;

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    if-ne v9, v2, :cond_7

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    invoke-static {v7}, LB0/g;->f(LR/e;)Lc0/l;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    goto :goto_2

    .line 139
    :cond_8
    iget-object v3, v3, Lc0/l;->u:Lc0/l;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_9
    invoke-virtual {v0}, LB0/L;->s()LB0/L;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    iget-object v3, v0, LB0/L;->U:LB0/g0;

    .line 149
    .line 150
    if-eqz v3, :cond_a

    .line 151
    .line 152
    iget-object v3, v3, LB0/g0;->d:LB0/B0;

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_a
    move-object v3, v6

    .line 156
    goto :goto_0

    .line 157
    :cond_b
    :goto_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_c

    .line 162
    .line 163
    return v2

    .line 164
    :cond_c
    return v1
.end method

.method public final dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, LC0/N;->a:LC0/N;

    .line 8
    .line 9
    invoke-virtual {p0}, LC0/A;->getView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, p1, v1}, LC0/N;->a(Landroid/view/ViewStructure;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, LC0/A;->M0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, LC0/A;->L0:LC0/m;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ne v3, v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eq v2, v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput-boolean v1, p0, LC0/A;->M0:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, LC0/m;->run()V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    invoke-static {p1}, LC0/A;->u(Landroid/view/MotionEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v2, 0x2

    .line 67
    if-ne v0, v2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0, p1}, LC0/A;->x(Landroid/view/MotionEvent;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-virtual {p0, p1}, LC0/A;->r(Landroid/view/MotionEvent;)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    and-int/lit8 v0, p1, 0x2

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 90
    .line 91
    .line 92
    :cond_5
    and-int/2addr p1, v2

    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    return v2

    .line 96
    :cond_6
    :goto_2
    return v1
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 3

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const-class v0, Landroid/view/View;

    .line 8
    .line 9
    const-string v1, "findViewByAccessibilityIdTraversal"

    .line 10
    .line 11
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    instance-of v0, p1, Landroid/view/View;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    check-cast p1, Landroid/view/View;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    invoke-static {p0, p1}, LC0/A;->p(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-object p1

    .line 49
    :catch_0
    :cond_1
    const/4 p1, 0x0

    .line 50
    return-object p1
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 7

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 4
    .line 5
    iget-boolean v0, v0, LB0/a0;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lh0/h;

    .line 26
    .line 27
    iget-object v1, v1, Lh0/h;->d:Lh0/o;

    .line 28
    .line 29
    invoke-static {v1}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-static {v1}, Lh0/d;->j(Lh0/o;)Li0/c;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    :goto_0
    if-nez v1, :cond_3

    .line 42
    .line 43
    invoke-static {p1, p0}, Lh0/d;->d(Landroid/view/View;LC0/A;)Li0/c;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-static {p1, p0}, Lh0/d;->d(Landroid/view/View;LC0/A;)Li0/c;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_3
    :goto_1
    invoke-static {p2}, Lh0/d;->E(I)Lh0/c;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iget v2, v2, Lh0/c;->a:I

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/4 v2, 0x6

    .line 62
    :goto_2
    new-instance v3, Lkotlin/jvm/internal/y;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    new-instance v5, LC0/v;

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    invoke-direct {v5, v3, v6}, LC0/v;-><init>(Lkotlin/jvm/internal/y;I)V

    .line 75
    .line 76
    .line 77
    check-cast v4, Lh0/h;

    .line 78
    .line 79
    invoke-virtual {v4, v2, v1, v5}, Lh0/h;->d(ILi0/c;LB5/c;)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-nez v4, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    iget-object v3, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 87
    .line 88
    if-nez v3, :cond_6

    .line 89
    .line 90
    if-nez v0, :cond_a

    .line 91
    .line 92
    :goto_3
    return-object p1

    .line 93
    :cond_6
    if-nez v0, :cond_7

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_7
    const/4 v4, 0x1

    .line 97
    if-ne v2, v4, :cond_8

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_8
    const/4 v4, 0x2

    .line 101
    if-ne v2, v4, :cond_9

    .line 102
    .line 103
    :goto_4
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    check-cast v3, Lh0/o;

    .line 112
    .line 113
    invoke-static {v3}, Lh0/d;->j(Lh0/o;)Li0/c;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {v0, p0}, Lh0/d;->d(Landroid/view/View;LC0/A;)Li0/c;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-static {p1, p2, v1, v2}, Lh0/d;->p(Li0/c;Li0/c;Li0/c;I)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_a

    .line 126
    .line 127
    :goto_5
    return-object p0

    .line 128
    :cond_a
    return-object v0

    .line 129
    :cond_b
    :goto_6
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1
.end method

.method public bridge synthetic getAccessibilityManager()LC0/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC0/A;->getAccessibilityManager()LC0/g;

    move-result-object v0

    return-object v0
.end method

.method public getAccessibilityManager()LC0/g;
    .locals 1

    .line 2
    iget-object v0, p0, LC0/A;->H:LC0/g;

    return-object v0
.end method

.method public final getAndroidViewsHandler$ui_release()LC0/k0;
    .locals 2

    .line 1
    iget-object v0, p0, LC0/A;->b0:LC0/k0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LC0/k0;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, LC0/k0;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LC0/A;->b0:LC0/k0;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p0, v0, v1}, LC0/A;->addView(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, LC0/A;->b0:LC0/k0;

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public getAutofill()Ld0/e;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->R:LE/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAutofillManager()Ld0/g;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->S:Ld0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAutofillTree()Ld0/h;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->J:Ld0/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getClipboard()LC0/h;
    .locals 1

    .line 2
    iget-object v0, p0, LC0/A;->V:LC0/h;

    return-object v0
.end method

.method public bridge synthetic getClipboard()LC0/p0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC0/A;->getClipboard()LC0/h;

    move-result-object v0

    return-object v0
.end method

.method public getClipboardManager()LC0/i;
    .locals 1

    .line 2
    iget-object v0, p0, LC0/A;->U:LC0/i;

    return-object v0
.end method

.method public bridge synthetic getClipboardManager()LC0/q0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC0/A;->getClipboardManager()LC0/i;

    move-result-object v0

    return-object v0
.end method

.method public final getConfigurationChangeObserver()LB5/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, LC0/A;->Q:LB5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContentCaptureManager$ui_release()Le0/c;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->G:Le0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCoroutineContext()Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->v:Lq5/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDensity()LW0/c;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->t:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LW0/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public getDragAndDropManager()Lf0/a;
    .locals 1

    .line 2
    iget-object v0, p0, LC0/A;->w:Lf0/a;

    return-object v0
.end method

.method public bridge synthetic getDragAndDropManager()Lf0/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC0/A;->getDragAndDropManager()Lf0/a;

    move-result-object v0

    return-object v0
.end method

.method public getFocusOwner()Lh0/g;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->u:Lh0/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LC0/A;->D()Li0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, v0, Li0/c;->a:F

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    iget v1, v0, Li0/c;->b:F

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p1, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    iget v1, v0, Li0/c;->c:F

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    iget v0, v0, Li0/c;->d:F

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, LC0/p;->s:LC0/p;

    .line 45
    .line 46
    check-cast v0, Lh0/h;

    .line 47
    .line 48
    const/4 v2, 0x6

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v0, v2, v3, v1}, Lh0/h;->d(ILi0/c;LB5/c;)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    const/high16 v0, -0x80000000

    .line 63
    .line 64
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public getFontFamilyResolver()LO0/d;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->z0:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LO0/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public getFontLoader()LO0/c;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->y0:LC0/E0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGraphicsContext()Lj0/t;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->I:Lj0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHapticFeedBack()Lr0/a;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->C0:Lr0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 2
    .line 3
    iget-object v0, v0, LB0/a0;->b:LB0/o;

    .line 4
    .line 5
    invoke-virtual {v0}, LB0/o;->E()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getImportantForAutofill()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public getInputModeManager()Ls0/b;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->D0:Ls0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui_release()J
    .locals 2

    .line 1
    iget-wide v0, p0, LC0/A;->k0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLayoutDirection()LW0/l;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->B0:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LW0/l;

    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic getLayoutNodes()Lr/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC0/A;->getLayoutNodes()Lr/v;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutNodes()Lr/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr/v;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, LC0/A;->B:Lr/v;

    return-object v0
.end method

.method public getMeasureIteration()J
    .locals 2

    .line 1
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 2
    .line 3
    iget-boolean v1, v0, LB0/a0;->c:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string v1, "measureIteration should be only used during the measure/layout pass"

    .line 8
    .line 9
    invoke-static {v1}, Ly0/a;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-wide v0, v0, LB0/a0;->g:J

    .line 13
    .line 14
    return-wide v0
.end method

.method public getModifierLocalManager()LA0/e;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->E0:LA0/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPlacementScope()Lz0/I;
    .locals 2

    .line 1
    sget v0, Lz0/L;->b:I

    .line 2
    .line 3
    new-instance v0, Lz0/z;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, v1, p0}, Lz0/z;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public getPointerIconService()Lv0/k;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->R0:LC0/E0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRectManager()LJ0/a;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->C:LJ0/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRoot()LB0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->A:LB0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRootForTest()LB0/z0;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->D:LC0/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScrollCaptureInProgress$ui_release()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LC0/A;->Q0:LC0/I0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LC0/I0;->a:LP/f0;

    .line 12
    .line 13
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public getSemanticsOwner()LI0/n;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->E:LI0/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSharedDrawScope()LB0/N;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->s:LB0/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShowLayoutBounds()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LC0/A;->a0:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSnapshotObserver()LB0/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->W:LB0/v0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSoftwareKeyboardController()LC0/X0;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->x0:LC0/E0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextInputService()LP0/e;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->v0:LP0/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextToolbar()LC0/Y0;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->F0:LC0/E0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getViewConfiguration()LC0/b1;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->z:LC0/j0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getViewTreeOwners()LC0/n;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->p0:LP/C;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/C;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC0/n;

    .line 8
    .line 9
    return-object v0
.end method

.method public getWindowInfo()LC0/f1;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->x:LC0/I0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final get_autofillManager$ui_release()Ld0/b;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->S:Ld0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, LC0/A;->x:LC0/I0;

    .line 9
    .line 10
    iget-object v2, v1, LC0/I0;->a:LP/f0;

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v2, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, LC0/A;->t(LB0/L;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, LC0/A;->s(LB0/L;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, LB0/v0;->a:La0/t;

    .line 41
    .line 42
    invoke-virtual {v0}, La0/t;->d()V

    .line 43
    .line 44
    .line 45
    invoke-static {}, LC0/A;->l()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    iget-object v0, p0, LC0/A;->R:LE/c0;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    sget-object v1, Ld0/f;->a:Ld0/f;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v0, v0, LE/c0;->s:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 63
    .line 64
    invoke-static {v1}, Lcom/google/firebase/c;->c(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager$AutofillCallback;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1}, Lcom/google/firebase/c;->A(Landroid/view/autofill/AutofillManager;Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/X;->d(Landroid/view/View;)Landroidx/lifecycle/x;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/n2;->p(Landroid/view/View;)Lg2/e;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {p0}, LC0/A;->getViewTreeOwners()LC0/n;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const/4 v3, 0x0

    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    iget-object v4, v2, LC0/n;->a:Landroidx/lifecycle/x;

    .line 91
    .line 92
    if-ne v0, v4, :cond_1

    .line 93
    .line 94
    if-eq v1, v4, :cond_4

    .line 95
    .line 96
    :cond_1
    if-eqz v0, :cond_b

    .line 97
    .line 98
    if-eqz v1, :cond_a

    .line 99
    .line 100
    if-eqz v2, :cond_2

    .line 101
    .line 102
    iget-object v2, v2, LC0/n;->a:Landroidx/lifecycle/x;

    .line 103
    .line 104
    invoke-interface {v2}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    invoke-virtual {v2, p0}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-interface {v0}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2, p0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, LC0/n;

    .line 121
    .line 122
    invoke-direct {v2, v0, v1}, LC0/n;-><init>(Landroidx/lifecycle/x;Lg2/e;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {p0, v2}, LC0/A;->set_viewTreeOwners(LC0/n;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, LC0/A;->q0:LB5/c;

    .line 129
    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    invoke-interface {v0, v2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_3
    iput-object v3, p0, LC0/A;->q0:LB5/c;

    .line 136
    .line 137
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    const/4 v0, 0x1

    .line 144
    goto :goto_0

    .line 145
    :cond_5
    const/4 v0, 0x2

    .line 146
    :goto_0
    iget-object v1, p0, LC0/A;->D0:Ls0/c;

    .line 147
    .line 148
    iget-object v1, v1, Ls0/c;->a:LP/f0;

    .line 149
    .line 150
    new-instance v2, Ls0/a;

    .line 151
    .line 152
    invoke-direct {v2, v0}, Ls0/a;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, LC0/A;->getViewTreeOwners()LC0/n;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-eqz v0, :cond_6

    .line 163
    .line 164
    iget-object v0, v0, LC0/n;->a:Landroidx/lifecycle/x;

    .line 165
    .line 166
    invoke-interface {v0}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    :cond_6
    if-eqz v3, :cond_9

    .line 171
    .line 172
    invoke-virtual {v3, p0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, LC0/A;->G:Le0/c;

    .line 176
    .line 177
    invoke-virtual {v3, v0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-object v1, p0, LC0/A;->r0:LC0/j;

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iget-object v1, p0, LC0/A;->s0:LC0/k;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iget-object v1, p0, LC0/A;->t0:LC0/l;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 205
    .line 206
    .line 207
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 208
    .line 209
    const/16 v1, 0x1f

    .line 210
    .line 211
    if-lt v0, v1, :cond_7

    .line 212
    .line 213
    sget-object v0, LC0/T;->a:LC0/T;

    .line 214
    .line 215
    invoke-virtual {v0, p0}, LC0/T;->b(Landroid/view/View;)V

    .line 216
    .line 217
    .line 218
    :cond_7
    iget-object v0, p0, LC0/A;->S:Ld0/b;

    .line 219
    .line 220
    if-eqz v0, :cond_8

    .line 221
    .line 222
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Lh0/h;

    .line 227
    .line 228
    iget-object v1, v1, Lh0/h;->i:Lr/C;

    .line 229
    .line 230
    invoke-virtual {v1, v0}, Lr/C;->a(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    iget-object v1, v1, LI0/n;->d:Lr/C;

    .line 238
    .line 239
    invoke-virtual {v1, v0}, Lr/C;->a(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_8
    return-void

    .line 243
    :cond_9
    const-string v0, "No lifecycle owner exists"

    .line 244
    .line 245
    invoke-static {v0}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    throw v0

    .line 250
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 251
    .line 252
    const-string v1, "Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!"

    .line 253
    .line 254
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 259
    .line 260
    const-string v1, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    .line 261
    .line 262
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v0
.end method

.method public final onCheckIsTextEditor()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->w0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LC0/A;->u0:LP0/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LQ2/g;->a(Landroid/content/Context;)LW0/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0, v0}, LC0/A;->setDensity(LW0/c;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LC0/A;->x:LC0/I0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/16 v2, 0x1f

    .line 24
    .line 25
    if-lt v0, v2, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, LB3/e;->a(Landroid/content/res/Configuration;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v3, v1

    .line 33
    :goto_0
    iget v4, p0, LC0/A;->A0:I

    .line 34
    .line 35
    if-eq v3, v4, :cond_2

    .line 36
    .line 37
    if-lt v0, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, LB3/e;->a(Landroid/content/res/Configuration;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    :cond_1
    iput v1, p0, LC0/A;->A0:I

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/P1;->r(Landroid/content/Context;)LO0/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p0, v0}, LC0/A;->setFontFamilyResolver(LO0/d;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object v0, p0, LC0/A;->Q:LB5/c;

    .line 57
    .line 58
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    .line 1
    iget-object p1, p0, LC0/A;->w0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LC0/A;->u0:LP0/c;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 6

    .line 1
    iget-object p2, p0, LC0/A;->G:Le0/c;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_3

    .line 9
    .line 10
    aget-wide v2, p1, v1

    .line 11
    .line 12
    invoke-virtual {p2}, Le0/c;->h()Lr/k;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    long-to-int v2, v2

    .line 17
    invoke-virtual {v4, v2}, Lr/k;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LC0/W0;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object v2, v2, LC0/W0;->a:LI0/m;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {}, Lc4/a;->q()V

    .line 31
    .line 32
    .line 33
    iget-object v3, p2, Le0/c;->q:LC0/A;

    .line 34
    .line 35
    invoke-static {v3}, Ld0/l;->g(LC0/A;)Landroid/view/autofill/AutofillId;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget v4, v2, LI0/m;->g:I

    .line 40
    .line 41
    int-to-long v4, v4

    .line 42
    invoke-static {v3, v4, v5}, Lc4/a;->l(Landroid/view/autofill/AutofillId;J)Landroid/view/translation/ViewTranslationRequest$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v2, v2, LI0/m;->d:LI0/i;

    .line 47
    .line 48
    sget-object v4, LI0/p;->y:LI0/s;

    .line 49
    .line 50
    iget-object v2, v2, LI0/i;->q:Lr/G;

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    :cond_1
    check-cast v2, Ljava/util/List;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    const-string v4, "\n"

    .line 64
    .line 65
    const/16 v5, 0x3e

    .line 66
    .line 67
    invoke-static {v5, v4, v2}, LY0/a;->a(ILjava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    new-instance v4, LL0/d;

    .line 74
    .line 75
    invoke-direct {v4, v2}, LL0/d;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v4}, Lc4/a;->j(LL0/d;)Landroid/view/translation/TranslationRequestValue;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v3, v2}, Lc4/a;->v(Landroid/view/translation/ViewTranslationRequest$Builder;Landroid/view/translation/TranslationRequestValue;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v3}, Lc4/a;->m(Landroid/view/translation/ViewTranslationRequest$Builder;)Landroid/view/translation/ViewTranslationRequest;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {p3, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, LB0/v0;->a:La0/t;

    .line 9
    .line 10
    iget-object v1, v1, La0/t;->h:LR4/L0;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, LR4/L0;->e()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, v0, LB0/v0;->a:La0/t;

    .line 18
    .line 19
    iget-object v1, v0, La0/t;->g:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget-object v0, v0, La0/t;->f:LR/e;

    .line 23
    .line 24
    iget-object v2, v0, LR/e;->q:[Ljava/lang/Object;

    .line 25
    .line 26
    iget v0, v0, LR/e;->s:I

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    :goto_0
    if-ge v3, v0, :cond_1

    .line 30
    .line 31
    aget-object v4, v2, v3

    .line 32
    .line 33
    check-cast v4, La0/s;

    .line 34
    .line 35
    iget-object v5, v4, La0/s;->e:Lr/G;

    .line 36
    .line 37
    invoke-virtual {v5}, Lr/G;->a()V

    .line 38
    .line 39
    .line 40
    iget-object v5, v4, La0/s;->f:Lr/G;

    .line 41
    .line 42
    invoke-virtual {v5}, Lr/G;->a()V

    .line 43
    .line 44
    .line 45
    iget-object v5, v4, La0/s;->k:Lr/G;

    .line 46
    .line 47
    invoke-virtual {v5}, Lr/G;->a()V

    .line 48
    .line 49
    .line 50
    iget-object v4, v4, La0/s;->l:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_1
    monitor-exit v1

    .line 62
    iget-object v0, p0, LC0/A;->x:LC0/I0;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, LC0/A;->getViewTreeOwners()LC0/n;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object v0, v0, LC0/n;->a:Landroidx/lifecycle/x;

    .line 74
    .line 75
    invoke-interface {v0}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    const/4 v0, 0x0

    .line 81
    :goto_1
    if-eqz v0, :cond_7

    .line 82
    .line 83
    iget-object v1, p0, LC0/A;->G:Le0/c;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p0}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, LC0/A;->l()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    iget-object v0, p0, LC0/A;->R:LE/c0;

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    sget-object v1, Ld0/f;->a:Ld0/f;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v0, v0, LE/c0;->s:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 109
    .line 110
    invoke-static {v1}, Lcom/google/firebase/c;->c(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager$AutofillCallback;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v0, v1}, Lcom/google/firebase/c;->x(Landroid/view/autofill/AutofillManager;Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v1, p0, LC0/A;->r0:LC0/j;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v1, p0, LC0/A;->s0:LC0/k;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v1, p0, LC0/A;->t0:LC0/l;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 142
    .line 143
    .line 144
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 145
    .line 146
    const/16 v1, 0x1f

    .line 147
    .line 148
    if-lt v0, v1, :cond_4

    .line 149
    .line 150
    sget-object v0, LC0/T;->a:LC0/T;

    .line 151
    .line 152
    invoke-virtual {v0, p0}, LC0/T;->a(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    iget-object v0, p0, LC0/A;->S:Ld0/b;

    .line 156
    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    invoke-virtual {p0}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iget-object v1, v1, LI0/n;->d:Lr/C;

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Lr/C;->f(Ljava/lang/Object;)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-ltz v2, :cond_5

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Lr/C;->i(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    :cond_5
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Lh0/h;

    .line 179
    .line 180
    iget-object v1, v1, Lh0/h;->i:Lr/C;

    .line 181
    .line 182
    invoke-virtual {v1, v0}, Lr/C;->f(Ljava/lang/Object;)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-ltz v0, :cond_6

    .line 187
    .line 188
    invoke-virtual {v1, v0}, Lr/C;->i(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :cond_6
    return-void

    .line 192
    :cond_7
    const-string v0, "No lifecycle owner exists"

    .line 193
    .line 194
    invoke-static {v0}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    throw v0

    .line 199
    :goto_2
    monitor-exit v1

    .line 200
    throw v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lh0/h;

    .line 17
    .line 18
    iget-object p1, p1, Lh0/h;->d:Lh0/o;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-static {p1, p2}, Lh0/d;->e(Lh0/o;Z)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LC0/A;->k0:J

    .line 4
    .line 5
    iget-object p1, p0, LC0/A;->f0:LB0/a0;

    .line 6
    .line 7
    iget-object v0, p0, LC0/A;->N0:LC0/y;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LB0/a0;->j(LC0/y;)Z

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, LC0/A;->d0:LW0/a;

    .line 14
    .line 15
    invoke-virtual {p0}, LC0/A;->P()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LC0/A;->b0:LC0/k0;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sub-int/2addr p4, p2

    .line 27
    sub-int/2addr p5, p3

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:onMeasure"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, LC0/A;->t(LB0/L;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    :goto_0
    invoke-static {p1}, LC0/A;->o(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    const/16 p1, 0x20

    .line 30
    .line 31
    ushr-long v3, v1, p1

    .line 32
    .line 33
    long-to-int v3, v3

    .line 34
    const-wide v4, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v1, v4

    .line 40
    long-to-int v1, v1

    .line 41
    invoke-static {p2}, LC0/A;->o(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    ushr-long p1, v6, p1

    .line 46
    .line 47
    long-to-int p1, p1

    .line 48
    and-long/2addr v4, v6

    .line 49
    long-to-int p2, v4

    .line 50
    invoke-static {v3, v1, p1, p2}, La/a;->w(IIII)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    iget-object v1, p0, LC0/A;->d0:LW0/a;

    .line 55
    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    new-instance v1, LW0/a;

    .line 59
    .line 60
    invoke-direct {v1, p1, p2}, LW0/a;-><init>(J)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, LC0/A;->d0:LW0/a;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    iput-boolean v1, p0, LC0/A;->e0:Z

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    iget-wide v1, v1, LW0/a;->a:J

    .line 70
    .line 71
    invoke-static {v1, v2, p1, p2}, LW0/a;->b(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    iput-boolean v1, p0, LC0/A;->e0:Z

    .line 79
    .line 80
    :cond_2
    :goto_1
    invoke-virtual {v0, p1, p2}, LB0/a0;->q(J)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, LB0/a0;->l()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p1, p1, LB0/L;->V:LB0/P;

    .line 91
    .line 92
    iget-object p1, p1, LB0/P;->p:LB0/c0;

    .line 93
    .line 94
    iget p1, p1, Lz0/J;->q:I

    .line 95
    .line 96
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iget-object p2, p2, LB0/L;->V:LB0/P;

    .line 101
    .line 102
    iget-object p2, p2, LB0/P;->p:LB0/c0;

    .line 103
    .line 104
    iget p2, p2, Lz0/J;->r:I

    .line 105
    .line 106
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, LC0/A;->b0:LC0/k0;

    .line 110
    .line 111
    if-eqz p1, :cond_3

    .line 112
    .line 113
    invoke-virtual {p0}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    iget-object p2, p2, LB0/L;->V:LB0/P;

    .line 122
    .line 123
    iget-object p2, p2, LB0/P;->p:LB0/c0;

    .line 124
    .line 125
    iget p2, p2, Lz0/J;->q:I

    .line 126
    .line 127
    const/high16 v0, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v1, v1, LB0/L;->V:LB0/P;

    .line 138
    .line 139
    iget-object v1, v1, LB0/P;->p:LB0/c0;

    .line 140
    .line 141
    iget v1, v1, Lz0/J;->r:I

    .line 142
    .line 143
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 155
    .line 156
    .line 157
    throw p1
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 11

    .line 1
    invoke-static {}, LC0/A;->l()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_9

    .line 6
    .line 7
    if-eqz p1, :cond_9

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    iget-object v0, p0, LC0/A;->S:Ld0/b;

    .line 11
    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    iget-object v1, v0, Ld0/b;->b:LI0/n;

    .line 15
    .line 16
    iget-object v1, v1, LI0/n;->a:LB0/L;

    .line 17
    .line 18
    iget-object v2, v0, Ld0/b;->f:Landroid/view/autofill/AutofillId;

    .line 19
    .line 20
    iget-object v3, v0, Ld0/b;->e:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v4, v0, Ld0/b;->d:LJ0/a;

    .line 23
    .line 24
    invoke-static {p1, v1, v2, v3, v4}, LD5/a;->B(Landroid/view/ViewStructure;LB0/L;Landroid/view/autofill/AutofillId;Ljava/lang/String;LJ0/a;)V

    .line 25
    .line 26
    .line 27
    sget-object v2, Lr/M;->a:[Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v2, Lr/C;

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    invoke-direct {v2, v5}, Lr/C;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lr/C;->a(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Lr/C;->a(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {v2}, Lr/C;->h()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    iget v1, v2, Lr/C;->b:I

    .line 48
    .line 49
    sub-int/2addr v1, p2

    .line 50
    invoke-virtual {v2, v1}, Lr/C;->i(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v5, "null cannot be cast to non-null type android.view.ViewStructure"

    .line 55
    .line 56
    invoke-static {v1, v5}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    check-cast v1, Landroid/view/ViewStructure;

    .line 60
    .line 61
    iget v5, v2, Lr/C;->b:I

    .line 62
    .line 63
    sub-int/2addr v5, p2

    .line 64
    invoke-virtual {v2, v5}, Lr/C;->i(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const-string v6, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo"

    .line 69
    .line 70
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    check-cast v5, LB0/L;

    .line 74
    .line 75
    invoke-virtual {v5}, LB0/L;->n()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    const/4 v7, 0x0

    .line 84
    :goto_0
    if-ge v7, v6, :cond_0

    .line 85
    .line 86
    move-object v8, v5

    .line 87
    check-cast v8, LR/b;

    .line 88
    .line 89
    invoke-virtual {v8, v7}, LR/b;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, LB0/L;

    .line 94
    .line 95
    iget-boolean v9, v8, LB0/L;->e0:Z

    .line 96
    .line 97
    if-nez v9, :cond_4

    .line 98
    .line 99
    invoke-virtual {v8}, LB0/L;->F()Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-eqz v9, :cond_4

    .line 104
    .line 105
    invoke-virtual {v8}, LB0/L;->G()Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-nez v9, :cond_1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    invoke-virtual {v8}, LB0/L;->u()LI0/i;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    if-eqz v9, :cond_3

    .line 117
    .line 118
    iget-object v9, v9, LI0/i;->q:Lr/G;

    .line 119
    .line 120
    sget-object v10, LI0/h;->g:LI0/s;

    .line 121
    .line 122
    invoke-virtual {v9, v10}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-nez v10, :cond_2

    .line 127
    .line 128
    sget-object v10, LI0/p;->p:LI0/s;

    .line 129
    .line 130
    invoke-virtual {v9, v10}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-nez v10, :cond_2

    .line 135
    .line 136
    sget-object v10, LI0/p;->q:LI0/s;

    .line 137
    .line 138
    invoke-virtual {v9, v10}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-eqz v9, :cond_3

    .line 143
    .line 144
    :cond_2
    invoke-virtual {v1, p2}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    invoke-virtual {v1, v9}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    iget-object v10, v0, Ld0/b;->f:Landroid/view/autofill/AutofillId;

    .line 153
    .line 154
    invoke-static {v9, v8, v10, v3, v4}, LD5/a;->B(Landroid/view/ViewStructure;LB0/L;Landroid/view/autofill/AutofillId;Ljava/lang/String;LJ0/a;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v8}, Lr/C;->a(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v9}, Lr/C;->a(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_3
    invoke-virtual {v2, v8}, Lr/C;->a(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v1}, Lr/C;->a(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_5
    iget-object v0, p0, LC0/A;->R:LE/c0;

    .line 174
    .line 175
    if-eqz v0, :cond_9

    .line 176
    .line 177
    iget-object v1, v0, LE/c0;->r:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Ld0/h;

    .line 180
    .line 181
    iget-object v2, v1, Ld0/h;->a:Ljava/util/LinkedHashMap;

    .line 182
    .line 183
    iget-object v1, v1, Ld0/h;->a:Ljava/util/LinkedHashMap;

    .line 184
    .line 185
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_6

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_6
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-nez v3, :cond_7

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Ljava/util/Map$Entry;

    .line 220
    .line 221
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, Ljava/lang/Number;

    .line 226
    .line 227
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-nez v1, :cond_8

    .line 236
    .line 237
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    iget-object v1, v0, LE/c0;->t:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v1, Landroid/view/autofill/AutofillId;

    .line 244
    .line 245
    invoke-static {p1, v1, v3}, Lcom/google/firebase/c;->s(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    .line 246
    .line 247
    .line 248
    iget-object v0, v0, LE/c0;->q:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, LC0/A;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const/4 v1, 0x0

    .line 261
    invoke-virtual {p1, v3, v0, v1, v1}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-static {p1, p2}, Lcom/google/firebase/c;->r(Landroid/view/ViewStructure;I)V

    .line 265
    .line 266
    .line 267
    throw v1

    .line 268
    :cond_8
    new-instance p1, Ljava/lang/ClassCastException;

    .line 269
    .line 270
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 271
    .line 272
    .line 273
    throw p1

    .line 274
    :cond_9
    :goto_2
    return-void
.end method

.method public final onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2002

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x4002

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, LC0/A;->getPointerIconService()Lv0/k;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LC0/A;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, LW0/l;->q:LW0/l;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p1, v1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object p1, LW0/l;->r:LW0/l;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object p1, v0

    .line 18
    :goto_0
    if-nez p1, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    move-object v0, p1

    .line 22
    :goto_1
    invoke-direct {p0, v0}, LC0/A;->setLayoutDirection(LW0/l;)V

    .line 23
    .line 24
    .line 25
    :cond_3
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V
    .locals 12

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 p2, 0x1f

    .line 4
    .line 5
    if-lt p1, p2, :cond_1

    .line 6
    .line 7
    iget-object v4, p0, LC0/A;->Q0:LC0/I0;

    .line 8
    .line 9
    if-eqz v4, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, LC0/A;->getCoroutineContext()Lq5/h;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance v9, LR/e;

    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    new-array v0, v0, [LH0/l;

    .line 24
    .line 25
    invoke-direct {v9, v0}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, LI0/n;->a()LI0/m;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v5, LH0/k;

    .line 33
    .line 34
    const-string v11, "add(Ljava/lang/Object;)Z"

    .line 35
    .line 36
    const/16 v7, 0x8

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    const-class v8, LR/e;

    .line 40
    .line 41
    const-string v10, "add"

    .line 42
    .line 43
    invoke-direct/range {v5 .. v11}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-static {p1, v0, v5}, LE3/h;->P(LI0/m;ILH0/k;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x2

    .line 51
    new-array p1, p1, [LB5/c;

    .line 52
    .line 53
    sget-object v1, LH0/d;->s:LH0/d;

    .line 54
    .line 55
    aput-object v1, p1, v0

    .line 56
    .line 57
    sget-object v0, LH0/d;->t:LH0/d;

    .line 58
    .line 59
    aput-object v0, p1, v6

    .line 60
    .line 61
    new-instance v0, LC0/J;

    .line 62
    .line 63
    invoke-direct {v0, v6, p1}, LC0/J;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9, v0}, LR/e;->q(Ljava/util/Comparator;)V

    .line 67
    .line 68
    .line 69
    iget p1, v9, LR/e;->s:I

    .line 70
    .line 71
    if-nez p1, :cond_0

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    sub-int/2addr p1, v6

    .line 76
    iget-object v0, v9, LR/e;->q:[Ljava/lang/Object;

    .line 77
    .line 78
    aget-object p1, v0, p1

    .line 79
    .line 80
    :goto_0
    check-cast p1, LH0/l;

    .line 81
    .line 82
    if-nez p1, :cond_2

    .line 83
    .line 84
    :cond_1
    move-object v5, p0

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    iget-object v2, p1, LH0/l;->c:LW0/j;

    .line 87
    .line 88
    invoke-static {p2}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    new-instance v0, LH0/f;

    .line 93
    .line 94
    iget-object v1, p1, LH0/l;->a:LI0/m;

    .line 95
    .line 96
    move-object v5, p0

    .line 97
    invoke-direct/range {v0 .. v5}, LH0/f;-><init>(LI0/m;LW0/j;LR5/d;LC0/I0;LC0/A;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p1, LH0/l;->d:LB0/n0;

    .line 101
    .line 102
    invoke-static {p1}, Lz0/O;->f(Lz0/m;)Lz0/m;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-interface {p2, p1, v6}, Lz0/m;->I(Lz0/m;Z)Li0/c;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget p2, v2, LW0/j;->a:I

    .line 111
    .line 112
    iget v1, v2, LW0/j;->b:I

    .line 113
    .line 114
    int-to-long v3, p2

    .line 115
    const/16 p2, 0x20

    .line 116
    .line 117
    shl-long/2addr v3, p2

    .line 118
    int-to-long v6, v1

    .line 119
    const-wide v8, 0xffffffffL

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    and-long/2addr v6, v8

    .line 125
    or-long/2addr v3, v6

    .line 126
    iget v1, p1, Li0/c;->a:F

    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    iget v6, p1, Li0/c;->b:F

    .line 133
    .line 134
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    iget v7, p1, Li0/c;->c:F

    .line 139
    .line 140
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    iget p1, p1, Li0/c;->d:F

    .line 145
    .line 146
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    new-instance v10, Landroid/graphics/Rect;

    .line 151
    .line 152
    invoke-direct {v10, v1, v6, v7, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 153
    .line 154
    .line 155
    new-instance p1, Landroid/graphics/Point;

    .line 156
    .line 157
    shr-long v6, v3, p2

    .line 158
    .line 159
    long-to-int p2, v6

    .line 160
    and-long/2addr v3, v8

    .line 161
    long-to-int v1, v3

    .line 162
    invoke-direct {p1, p2, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 163
    .line 164
    .line 165
    invoke-static {p0, v10, p1, v0}, LB3/e;->f(LC0/A;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)Landroid/view/ScrollCaptureTarget;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-static {v2}, Lj0/B;->t(LW0/j;)Landroid/graphics/Rect;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-static {p1, p2}, LB3/e;->n(Landroid/view/ScrollCaptureTarget;Landroid/graphics/Rect;)V

    .line 174
    .line 175
    .line 176
    invoke-interface {p3, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :goto_1
    return-void
.end method

.method public final onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 4

    .line 1
    iget-object v0, p0, LC0/A;->G:Le0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x1f

    .line 9
    .line 10
    if-ge v1, v2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-static {v0, p1}, LC3/a;->v(Le0/c;Landroid/util/LongSparseArray;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v1, v0, Le0/c;->q:LC0/A;

    .line 36
    .line 37
    new-instance v2, LN5/c;

    .line 38
    .line 39
    const/4 v3, 0x6

    .line 40
    invoke-direct {v2, v3, v0, p1}, LN5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LC0/A;->x:LC0/I0;

    .line 2
    .line 3
    iget-object v0, v0, LC0/I0;->a:LP/f0;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, LC0/A;->P0:Z

    .line 14
    .line 15
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {}, LC0/E0;->a()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0}, LC0/A;->getShowLayoutBounds()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eq v0, p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, p1}, LC0/A;->setShowLayoutBounds(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, LC0/A;->s(LB0/L;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final q(LB0/L;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LB0/a0;->f(LB0/L;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r(Landroid/view/MotionEvent;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, LC0/A;->K0:LA1/b;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    invoke-virtual/range {p0 .. p1}, LC0/A;->J(Landroid/view/MotionEvent;)V

    .line 12
    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    iput-boolean v8, v1, LC0/A;->l0:Z

    .line 16
    .line 17
    invoke-virtual {v1, v7}, LC0/A;->z(Z)V

    .line 18
    .line 19
    .line 20
    const-string v2, "AndroidOwner:onTouch"

    .line 21
    .line 22
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    iget-object v2, v1, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 30
    .line 31
    const/4 v10, 0x3

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 35
    .line 36
    .line 37
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    if-ne v3, v10, :cond_0

    .line 39
    .line 40
    move v11, v8

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v11, v7

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_d

    .line 46
    .line 47
    :goto_0
    const/16 v12, 0xa

    .line 48
    .line 49
    iget-object v13, v1, LC0/A;->P:LL/s;

    .line 50
    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    :try_start_2
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getSource()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ne v3, v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eq v3, v4, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move v3, v7

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    :goto_1
    move v3, v8

    .line 77
    :goto_2
    if-eqz v3, :cond_5

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    :cond_3
    move-object v14, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    const/4 v4, 0x2

    .line 94
    if-eq v3, v4, :cond_3

    .line 95
    .line 96
    const/4 v4, 0x6

    .line 97
    if-eq v3, v4, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eq v3, v12, :cond_5

    .line 104
    .line 105
    if-eqz v11, :cond_5

    .line 106
    .line 107
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    const/4 v6, 0x1

    .line 112
    const/16 v3, 0xa

    .line 113
    .line 114
    invoke-virtual/range {v1 .. v6}, LC0/A;->O(Landroid/view/MotionEvent;IJZ)V

    .line 115
    .line 116
    .line 117
    move-object v14, v2

    .line 118
    goto :goto_4

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    move-object/from16 v1, p0

    .line 121
    .line 122
    goto/16 :goto_d

    .line 123
    .line 124
    :cond_5
    move-object v14, v2

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    iget-boolean v1, v13, LL/s;->a:Z

    .line 127
    .line 128
    if-nez v1, :cond_6

    .line 129
    .line 130
    iget-object v1, v13, LL/s;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Li3/a;

    .line 133
    .line 134
    iget-object v1, v1, Li3/a;->r:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Lr/q;

    .line 137
    .line 138
    invoke-virtual {v1}, Lr/q;->a()V

    .line 139
    .line 140
    .line 141
    iget-object v1, v13, LL/s;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, LC0/H0;

    .line 144
    .line 145
    invoke-virtual {v1}, LC0/H0;->e()V

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_4
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-ne v1, v10, :cond_7

    .line 153
    .line 154
    move v1, v8

    .line 155
    goto :goto_5

    .line 156
    :cond_7
    move v1, v7

    .line 157
    :goto_5
    const/16 v15, 0x9

    .line 158
    .line 159
    if-nez v11, :cond_8

    .line 160
    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    if-eq v9, v10, :cond_8

    .line 164
    .line 165
    if-eq v9, v15, :cond_8

    .line 166
    .line 167
    invoke-virtual/range {p0 .. p1}, LC0/A;->w(Landroid/view/MotionEvent;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_8

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    .line 174
    .line 175
    .line 176
    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    const/4 v6, 0x1

    .line 178
    const/16 v3, 0x9

    .line 179
    .line 180
    move-object/from16 v1, p0

    .line 181
    .line 182
    move-object v2, v0

    .line 183
    :try_start_3
    invoke-virtual/range {v1 .. v6}, LC0/A;->O(Landroid/view/MotionEvent;IJZ)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    move-object/from16 v1, p0

    .line 188
    .line 189
    :goto_6
    if-eqz v14, :cond_9

    .line 190
    .line 191
    invoke-virtual {v14}, Landroid/view/MotionEvent;->recycle()V

    .line 192
    .line 193
    .line 194
    :cond_9
    iget-object v0, v1, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 195
    .line 196
    if-eqz v0, :cond_14

    .line 197
    .line 198
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-ne v0, v12, :cond_14

    .line 203
    .line 204
    iget-object v0, v1, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 205
    .line 206
    if-eqz v0, :cond_a

    .line 207
    .line 208
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    goto :goto_7

    .line 213
    :cond_a
    const/4 v0, -0x1

    .line 214
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 215
    .line 216
    .line 217
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 218
    iget-object v3, v1, LC0/A;->O:Lv0/c;

    .line 219
    .line 220
    if-ne v2, v15, :cond_b

    .line 221
    .line 222
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_b

    .line 227
    .line 228
    if-ltz v0, :cond_14

    .line 229
    .line 230
    iget-object v2, v3, Lv0/c;->c:Landroid/util/SparseBooleanArray;

    .line 231
    .line 232
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 233
    .line 234
    .line 235
    iget-object v2, v3, Lv0/c;->b:Landroid/util/SparseLongArray;

    .line 236
    .line 237
    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_c

    .line 241
    .line 242
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-nez v2, :cond_14

    .line 247
    .line 248
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-nez v2, :cond_14

    .line 253
    .line 254
    iget-object v2, v1, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 255
    .line 256
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 257
    .line 258
    if-eqz v2, :cond_c

    .line 259
    .line 260
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    goto :goto_8

    .line 265
    :cond_c
    move v2, v4

    .line 266
    :goto_8
    iget-object v5, v1, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 267
    .line 268
    if-eqz v5, :cond_d

    .line 269
    .line 270
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    cmpg-float v2, v2, v5

    .line 283
    .line 284
    if-nez v2, :cond_e

    .line 285
    .line 286
    cmpg-float v2, v4, v6

    .line 287
    .line 288
    if-nez v2, :cond_e

    .line 289
    .line 290
    move v2, v7

    .line 291
    goto :goto_9

    .line 292
    :cond_e
    move v2, v8

    .line 293
    :goto_9
    iget-object v4, v1, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 294
    .line 295
    if-eqz v4, :cond_f

    .line 296
    .line 297
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getEventTime()J

    .line 298
    .line 299
    .line 300
    move-result-wide v4

    .line 301
    goto :goto_a

    .line 302
    :cond_f
    const-wide/16 v4, -0x1

    .line 303
    .line 304
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 305
    .line 306
    .line 307
    move-result-wide v9

    .line 308
    cmp-long v4, v4, v9

    .line 309
    .line 310
    if-eqz v4, :cond_10

    .line 311
    .line 312
    move v4, v8

    .line 313
    goto :goto_b

    .line 314
    :cond_10
    move v4, v7

    .line 315
    :goto_b
    if-nez v2, :cond_11

    .line 316
    .line 317
    if-eqz v4, :cond_14

    .line 318
    .line 319
    :cond_11
    if-ltz v0, :cond_12

    .line 320
    .line 321
    iget-object v2, v3, Lv0/c;->c:Landroid/util/SparseBooleanArray;

    .line 322
    .line 323
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 324
    .line 325
    .line 326
    iget-object v2, v3, Lv0/c;->b:Landroid/util/SparseLongArray;

    .line 327
    .line 328
    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    .line 329
    .line 330
    .line 331
    :cond_12
    iget-object v0, v13, LL/s;->c:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, LC0/H0;

    .line 334
    .line 335
    iget-boolean v2, v0, LC0/H0;->c:Z

    .line 336
    .line 337
    if-eqz v2, :cond_13

    .line 338
    .line 339
    iput-boolean v8, v0, LC0/H0;->c:Z

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_13
    iget-object v0, v0, LC0/H0;->g:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Lv0/e;

    .line 345
    .line 346
    iget-object v0, v0, Lv0/e;->a:LR/e;

    .line 347
    .line 348
    invoke-virtual {v0}, LR/e;->i()V

    .line 349
    .line 350
    .line 351
    :cond_14
    :goto_c
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    iput-object v0, v1, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 356
    .line 357
    invoke-virtual/range {p0 .. p1}, LC0/A;->N(Landroid/view/MotionEvent;)I

    .line 358
    .line 359
    .line 360
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 361
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 362
    .line 363
    .line 364
    iput-boolean v7, v1, LC0/A;->l0:Z

    .line 365
    .line 366
    return v0

    .line 367
    :catchall_2
    move-exception v0

    .line 368
    goto :goto_e

    .line 369
    :goto_d
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 370
    .line 371
    .line 372
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 373
    :goto_e
    iput-boolean v7, v1, LC0/A;->l0:Z

    .line 374
    .line 375
    throw v0
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lh0/h;

    .line 14
    .line 15
    iget-object v0, v0, Lh0/h;->d:Lh0/o;

    .line 16
    .line 17
    invoke-virtual {v0}, Lh0/o;->z0()Lh0/n;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    if-eq v0, v1, :cond_4

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    if-eq v0, v1, :cond_4

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    if-ne v0, v1, :cond_3

    .line 34
    .line 35
    invoke-static {p1}, Lh0/d;->E(I)Lh0/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget p1, p1, Lh0/c;->a:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p1, 0x7

    .line 45
    :goto_0
    invoke-virtual {p0}, LC0/A;->getFocusOwner()Lh0/g;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    new-instance v1, Li0/c;

    .line 52
    .line 53
    iget v2, p2, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    int-to-float v2, v2

    .line 56
    iget v3, p2, Landroid/graphics/Rect;->top:I

    .line 57
    .line 58
    int-to-float v3, v3

    .line 59
    iget v4, p2, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    int-to-float v4, v4

    .line 62
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    int-to-float p2, p2

    .line 65
    invoke-direct {v1, v2, v3, v4, p2}, Li0/c;-><init>(FFFF)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 v1, 0x0

    .line 70
    :goto_1
    new-instance p2, LC/w;

    .line 71
    .line 72
    invoke-direct {p2, p1}, LC/w;-><init>(I)V

    .line 73
    .line 74
    .line 75
    check-cast v0, Lh0/h;

    .line 76
    .line 77
    invoke-virtual {v0, p1, v1, p2}, Lh0/h;->d(ILi0/c;LB5/c;)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    return p1

    .line 88
    :cond_3
    new-instance p1, LC2/e;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    return p1
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/A;->F:LC0/I;

    .line 2
    .line 3
    iput-wide p1, v0, LC0/I;->h:J

    .line 4
    .line 5
    return-void
.end method

.method public final setConfigurationChangeObserver(LB5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LC0/A;->Q:LB5/c;

    .line 2
    .line 3
    return-void
.end method

.method public final setContentCaptureManager$ui_release(Le0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC0/A;->G:Le0/c;

    .line 2
    .line 3
    return-void
.end method

.method public setCoroutineContext(Lq5/h;)V
    .locals 10

    .line 1
    iput-object p1, p0, LC0/A;->v:Lq5/h;

    .line 2
    .line 3
    invoke-virtual {p0}, LC0/A;->getRoot()LB0/L;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, LB0/L;->U:LB0/g0;

    .line 8
    .line 9
    iget-object p1, p1, LB0/g0;->e:Lc0/l;

    .line 10
    .line 11
    instance-of v0, p1, Lv0/A;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, Lv0/A;

    .line 17
    .line 18
    invoke-virtual {v0}, Lv0/A;->y0()V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p1, Lc0/l;->q:Lc0/l;

    .line 22
    .line 23
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "visitSubtreeIf called on an unattached node"

    .line 28
    .line 29
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance v0, LR/e;

    .line 33
    .line 34
    const/16 v1, 0x10

    .line 35
    .line 36
    new-array v2, v1, [Lc0/l;

    .line 37
    .line 38
    invoke-direct {v0, v2}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, Lc0/l;->q:Lc0/l;

    .line 42
    .line 43
    iget-object v2, p1, Lc0/l;->v:Lc0/l;

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    invoke-static {v0, p1}, LB0/g;->b(LR/e;Lc0/l;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {v0, v2}, LR/e;->c(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    iget p1, v0, LR/e;->s:I

    .line 55
    .line 56
    if-eqz p1, :cond_c

    .line 57
    .line 58
    add-int/lit8 p1, p1, -0x1

    .line 59
    .line 60
    invoke-virtual {v0, p1}, LR/e;->m(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lc0/l;

    .line 65
    .line 66
    iget v2, p1, Lc0/l;->t:I

    .line 67
    .line 68
    and-int/2addr v2, v1

    .line 69
    if-eqz v2, :cond_b

    .line 70
    .line 71
    move-object v2, p1

    .line 72
    :goto_1
    if-eqz v2, :cond_b

    .line 73
    .line 74
    iget v3, v2, Lc0/l;->s:I

    .line 75
    .line 76
    and-int/2addr v3, v1

    .line 77
    if-eqz v3, :cond_a

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    move-object v4, v2

    .line 81
    move-object v5, v3

    .line 82
    :goto_2
    if-eqz v4, :cond_a

    .line 83
    .line 84
    instance-of v6, v4, LB0/y0;

    .line 85
    .line 86
    if-eqz v6, :cond_3

    .line 87
    .line 88
    check-cast v4, LB0/y0;

    .line 89
    .line 90
    instance-of v6, v4, Lv0/A;

    .line 91
    .line 92
    if-eqz v6, :cond_9

    .line 93
    .line 94
    check-cast v4, Lv0/A;

    .line 95
    .line 96
    invoke-virtual {v4}, Lv0/A;->y0()V

    .line 97
    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_3
    iget v6, v4, Lc0/l;->s:I

    .line 101
    .line 102
    and-int/2addr v6, v1

    .line 103
    if-eqz v6, :cond_9

    .line 104
    .line 105
    instance-of v6, v4, LB0/n;

    .line 106
    .line 107
    if-eqz v6, :cond_9

    .line 108
    .line 109
    move-object v6, v4

    .line 110
    check-cast v6, LB0/n;

    .line 111
    .line 112
    iget-object v6, v6, LB0/n;->F:Lc0/l;

    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    :goto_3
    const/4 v8, 0x1

    .line 116
    if-eqz v6, :cond_8

    .line 117
    .line 118
    iget v9, v6, Lc0/l;->s:I

    .line 119
    .line 120
    and-int/2addr v9, v1

    .line 121
    if-eqz v9, :cond_7

    .line 122
    .line 123
    add-int/lit8 v7, v7, 0x1

    .line 124
    .line 125
    if-ne v7, v8, :cond_4

    .line 126
    .line 127
    move-object v4, v6

    .line 128
    goto :goto_4

    .line 129
    :cond_4
    if-nez v5, :cond_5

    .line 130
    .line 131
    new-instance v5, LR/e;

    .line 132
    .line 133
    new-array v8, v1, [Lc0/l;

    .line 134
    .line 135
    invoke-direct {v5, v8}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_5
    if-eqz v4, :cond_6

    .line 139
    .line 140
    invoke-virtual {v5, v4}, LR/e;->c(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    move-object v4, v3

    .line 144
    :cond_6
    invoke-virtual {v5, v6}, LR/e;->c(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    :goto_4
    iget-object v6, v6, Lc0/l;->v:Lc0/l;

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    if-ne v7, v8, :cond_9

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    :goto_5
    invoke-static {v5}, LB0/g;->f(LR/e;)Lc0/l;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    goto :goto_2

    .line 158
    :cond_a
    iget-object v2, v2, Lc0/l;->v:Lc0/l;

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_b
    invoke-static {v0, p1}, LB0/g;->b(LR/e;Lc0/l;)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_c
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui_release(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LC0/A;->k0:J

    .line 2
    .line 3
    return-void
.end method

.method public final setOnViewTreeOwnersAvailable(LB5/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, LC0/A;->getViewTreeOwners()LC0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iput-object p1, p0, LC0/A;->q0:LB5/c;

    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LC0/A;->a0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final t(LB0/L;)V
    .locals 3

    .line 1
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, LB0/a0;->p(LB0/L;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, LB0/L;->w()LR/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, LR/e;->q:[Ljava/lang/Object;

    .line 12
    .line 13
    iget p1, p1, LR/e;->s:I

    .line 14
    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    aget-object v2, v0, v1

    .line 18
    .line 19
    check-cast v2, LB0/L;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, LC0/A;->t(LB0/L;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final w(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v2, v1, v0

    .line 11
    .line 12
    if-gtz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    cmpg-float v0, v0, v2

    .line 20
    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    cmpg-float v0, v1, p1

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-float v0, v0

    .line 32
    cmpg-float p1, p1, v0

    .line 33
    .line 34
    if-gtz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    return p1
.end method

.method public final x(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, LC0/A;->G0:Landroid/view/MotionEvent;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v2, v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    cmpg-float v2, v2, v3

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    cmpg-float p1, p1, v0

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    return p1

    .line 49
    :cond_1
    :goto_0
    return v1
.end method

.method public final y(J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, LC0/A;->I()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LC0/A;->i0:[F

    .line 5
    .line 6
    invoke-static {v0, p1, p2}, Lj0/B;->o([FJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    shr-long v1, p1, v0

    .line 13
    .line 14
    long-to-int v1, v1

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-wide v2, p0, LC0/A;->m0:J

    .line 20
    .line 21
    shr-long/2addr v2, v0

    .line 22
    long-to-int v2, v2

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-float/2addr v2, v1

    .line 28
    const-wide v3, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr p1, v3

    .line 34
    long-to-int p1, p1

    .line 35
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-wide v5, p0, LC0/A;->m0:J

    .line 40
    .line 41
    and-long/2addr v5, v3

    .line 42
    long-to-int p2, v5

    .line 43
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    add-float/2addr p2, p1

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    int-to-long v1, p1

    .line 53
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    int-to-long p1, p1

    .line 58
    shl-long v0, v1, v0

    .line 59
    .line 60
    and-long/2addr p1, v3

    .line 61
    or-long/2addr p1, v0

    .line 62
    return-wide p1
.end method

.method public final z(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LC0/A;->f0:LB0/a0;

    .line 2
    .line 3
    iget-object v1, v0, LB0/a0;->b:LB0/o;

    .line 4
    .line 5
    invoke-virtual {v1}, LB0/o;->E()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, LB0/a0;->e:LB0/o;

    .line 12
    .line 13
    iget-object v1, v1, LB0/o;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LR/e;

    .line 16
    .line 17
    iget v1, v1, LR/e;->s:I

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 24
    .line 25
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    :try_start_0
    iget-object p1, p0, LC0/A;->N0:LC0/y;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    :goto_1
    invoke-virtual {v0, p1}, LB0/a0;->j(LC0/y;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 43
    .line 44
    .line 45
    :cond_3
    const/4 p1, 0x0

    .line 46
    invoke-virtual {v0, p1}, LB0/a0;->a(Z)V

    .line 47
    .line 48
    .line 49
    iget-boolean v0, p0, LC0/A;->N:Z

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    .line 58
    .line 59
    .line 60
    iput-boolean p1, p0, LC0/A;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    :cond_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 67
    .line 68
    .line 69
    throw p1
.end method
