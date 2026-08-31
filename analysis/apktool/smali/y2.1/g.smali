.class public final Ly2/g;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Ly2/i;

.field public final synthetic s:LD2/j;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:LD2/n;

.field public final synthetic v:Lt2/c;

.field public final synthetic w:LB2/a;

.field public final synthetic x:LM2/k;


# direct methods
.method public constructor <init>(Ly2/i;LD2/j;Ljava/lang/Object;LD2/n;Lt2/c;LB2/a;LM2/k;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/g;->r:Ly2/i;

    .line 2
    .line 3
    iput-object p2, p0, Ly2/g;->s:LD2/j;

    .line 4
    .line 5
    iput-object p3, p0, Ly2/g;->t:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Ly2/g;->u:LD2/n;

    .line 8
    .line 9
    iput-object p5, p0, Ly2/g;->v:Lt2/c;

    .line 10
    .line 11
    iput-object p6, p0, Ly2/g;->w:LB2/a;

    .line 12
    .line 13
    iput-object p7, p0, Ly2/g;->x:LM2/k;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Ls5/i;-><init>(ILq5/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 9

    .line 1
    new-instance v0, Ly2/g;

    .line 2
    .line 3
    iget-object v6, p0, Ly2/g;->w:LB2/a;

    .line 4
    .line 5
    iget-object v7, p0, Ly2/g;->x:LM2/k;

    .line 6
    .line 7
    iget-object v1, p0, Ly2/g;->r:Ly2/i;

    .line 8
    .line 9
    iget-object v2, p0, Ly2/g;->s:LD2/j;

    .line 10
    .line 11
    iget-object v3, p0, Ly2/g;->t:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v4, p0, Ly2/g;->u:LD2/n;

    .line 14
    .line 15
    iget-object v5, p0, Ly2/g;->v:Lt2/c;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Ly2/g;-><init>(Ly2/i;LD2/j;Ljava/lang/Object;LD2/n;Lt2/c;LB2/a;LM2/k;Lq5/c;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ly2/g;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ly2/g;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ly2/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 4
    .line 5
    iget v0, v5, Ly2/g;->q:I

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v7, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v5, Ly2/g;->r:Ly2/i;

    .line 30
    .line 31
    iget-object v1, v5, Ly2/g;->s:LD2/j;

    .line 32
    .line 33
    iget-object v2, v5, Ly2/g;->t:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v3, v5, Ly2/g;->u:LD2/n;

    .line 36
    .line 37
    iget-object v4, v5, Ly2/g;->v:Lt2/c;

    .line 38
    .line 39
    iput v7, v5, Ly2/g;->q:I

    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, Ly2/i;->b(Ly2/i;LD2/j;Ljava/lang/Object;LD2/n;Lt2/c;Ls5/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-ne v0, v6, :cond_2

    .line 46
    .line 47
    return-object v6

    .line 48
    :cond_2
    :goto_0
    check-cast v0, Ly2/a;

    .line 49
    .line 50
    iget-object v1, v5, Ly2/g;->r:Ly2/i;

    .line 51
    .line 52
    iget-object v1, v1, Ly2/i;->b:LH2/m;

    .line 53
    .line 54
    monitor-enter v1

    .line 55
    :try_start_0
    iget-object v2, v1, LH2/m;->q:Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lt2/l;

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    iget-object v3, v1, LH2/m;->r:Landroid/content/Context;

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    iget-object v2, v2, Lt2/l;->a:Landroid/content/Context;

    .line 70
    .line 71
    iput-object v2, v1, LH2/m;->r:Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_3
    invoke-virtual {v1}, LH2/m;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_1
    monitor-exit v1

    .line 84
    iget-object v1, v5, Ly2/g;->r:Ly2/i;

    .line 85
    .line 86
    iget-object v1, v1, Ly2/i;->d:Lk3/d;

    .line 87
    .line 88
    iget-object v2, v5, Ly2/g;->w:LB2/a;

    .line 89
    .line 90
    iget-object v3, v5, Ly2/g;->s:LD2/j;

    .line 91
    .line 92
    iget-object v3, v3, LD2/j;->o:LD2/b;

    .line 93
    .line 94
    iget-boolean v3, v3, LD2/b;->r:Z

    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    const/4 v6, 0x0

    .line 98
    if-nez v3, :cond_6

    .line 99
    .line 100
    :cond_5
    :goto_2
    move v1, v4

    .line 101
    goto :goto_4

    .line 102
    :cond_6
    iget-object v1, v1, Lk3/d;->r:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Lt2/l;

    .line 105
    .line 106
    iget-object v1, v1, Lt2/l;->c:Lm5/o;

    .line 107
    .line 108
    invoke-virtual {v1}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, LB2/c;

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    if-nez v2, :cond_7

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_7
    iget-object v3, v0, Ly2/a;->a:Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    instance-of v8, v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 122
    .line 123
    if-eqz v8, :cond_8

    .line 124
    .line 125
    check-cast v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    move-object v3, v6

    .line 129
    :goto_3
    if-eqz v3, :cond_5

    .line 130
    .line 131
    invoke-virtual {v3}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    if-nez v3, :cond_9

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_9
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 139
    .line 140
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v9, "coil#is_sampled"

    .line 144
    .line 145
    iget-boolean v10, v0, Ly2/a;->b:Z

    .line 146
    .line 147
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    iget-object v9, v0, Ly2/a;->d:Ljava/lang/String;

    .line 155
    .line 156
    if-eqz v9, :cond_a

    .line 157
    .line 158
    const-string v10, "coil#disk_cache_key"

    .line 159
    .line 160
    invoke-interface {v8, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_a
    iget-object v1, v1, LB2/c;->a:LB2/h;

    .line 164
    .line 165
    iget-object v9, v2, LB2/a;->r:Ljava/util/Map;

    .line 166
    .line 167
    invoke-static {v9}, Lcom/google/android/gms/internal/measurement/I1;->F0(Ljava/util/Map;)Ljava/util/Map;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    iget-object v2, v2, LB2/a;->q:Ljava/lang/String;

    .line 172
    .line 173
    new-instance v10, LB2/a;

    .line 174
    .line 175
    invoke-direct {v10, v2, v9}, LB2/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/I1;->F0(Ljava/util/Map;)Ljava/util/Map;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-interface {v1, v10, v3, v2}, LB2/h;->a(LB2/a;Landroid/graphics/Bitmap;Ljava/util/Map;)V

    .line 183
    .line 184
    .line 185
    move v1, v7

    .line 186
    :goto_4
    iget-object v9, v0, Ly2/a;->a:Landroid/graphics/drawable/Drawable;

    .line 187
    .line 188
    iget-object v10, v5, Ly2/g;->s:LD2/j;

    .line 189
    .line 190
    iget-object v11, v0, Ly2/a;->c:Lv2/e;

    .line 191
    .line 192
    iget-object v2, v5, Ly2/g;->w:LB2/a;

    .line 193
    .line 194
    if-eqz v1, :cond_b

    .line 195
    .line 196
    move-object v12, v2

    .line 197
    goto :goto_5

    .line 198
    :cond_b
    move-object v12, v6

    .line 199
    :goto_5
    iget-object v13, v0, Ly2/a;->d:Ljava/lang/String;

    .line 200
    .line 201
    iget-boolean v14, v0, Ly2/a;->b:Z

    .line 202
    .line 203
    iget-object v0, v5, Ly2/g;->x:LM2/k;

    .line 204
    .line 205
    sget-object v1, LH2/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 206
    .line 207
    if-eqz v0, :cond_c

    .line 208
    .line 209
    iget-boolean v0, v0, LM2/k;->c:Z

    .line 210
    .line 211
    if-eqz v0, :cond_c

    .line 212
    .line 213
    move v15, v7

    .line 214
    goto :goto_6

    .line 215
    :cond_c
    move v15, v4

    .line 216
    :goto_6
    new-instance v8, LD2/r;

    .line 217
    .line 218
    invoke-direct/range {v8 .. v15}, LD2/r;-><init>(Landroid/graphics/drawable/Drawable;LD2/j;Lv2/e;LB2/a;Ljava/lang/String;ZZ)V

    .line 219
    .line 220
    .line 221
    return-object v8

    .line 222
    :goto_7
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 223
    throw v0
.end method
