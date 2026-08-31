.class public final Landroidx/lifecycle/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/h0;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Landroidx/lifecycle/g0;

.field public final c:Landroid/os/Bundle;

.field public final d:Landroidx/lifecycle/q;

.field public final e:LZ/m;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/g0;

    const/4 v1, 0x0

    .line 3
    invoke-direct {v0, v1}, Landroidx/lifecycle/g0;-><init>(Landroid/app/Application;)V

    .line 4
    iput-object v0, p0, Landroidx/lifecycle/a0;->b:Landroidx/lifecycle/g0;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lg2/e;Landroid/os/Bundle;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-interface {p2}, Lg2/e;->b()LZ/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/a0;->e:LZ/m;

    .line 7
    invoke-interface {p2}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object p2

    iput-object p2, p0, Landroidx/lifecycle/a0;->d:Landroidx/lifecycle/q;

    .line 8
    iput-object p3, p0, Landroidx/lifecycle/a0;->c:Landroid/os/Bundle;

    .line 9
    iput-object p1, p0, Landroidx/lifecycle/a0;->a:Landroid/app/Application;

    if-eqz p1, :cond_1

    .line 10
    sget-object p2, Landroidx/lifecycle/g0;->c:Landroidx/lifecycle/g0;

    if-nez p2, :cond_0

    .line 11
    new-instance p2, Landroidx/lifecycle/g0;

    .line 12
    invoke-direct {p2, p1}, Landroidx/lifecycle/g0;-><init>(Landroid/app/Application;)V

    .line 13
    sput-object p2, Landroidx/lifecycle/g0;->c:Landroidx/lifecycle/g0;

    .line 14
    :cond_0
    sget-object p1, Landroidx/lifecycle/g0;->c:Landroidx/lifecycle/g0;

    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    goto :goto_0

    .line 16
    :cond_1
    new-instance p1, Landroidx/lifecycle/g0;

    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, Landroidx/lifecycle/g0;-><init>(Landroid/app/Application;)V

    .line 18
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/a0;->b:Landroidx/lifecycle/g0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Landroidx/lifecycle/f0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/a0;->d(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final b(Lkotlin/jvm/internal/f;LP1/e;)Landroidx/lifecycle/f0;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/n2;->s(LH5/c;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/a0;->c(Ljava/lang/Class;LP1/e;)Landroidx/lifecycle/f0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final c(Ljava/lang/Class;LP1/e;)Landroidx/lifecycle/f0;
    .locals 3

    .line 1
    iget-object v0, p2, LP1/c;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/j0;->b:LO3/B;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    sget-object v2, Landroidx/lifecycle/X;->a:LO3/D;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    sget-object v2, Landroidx/lifecycle/X;->b:LO3/B;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    sget-object v1, Landroidx/lifecycle/g0;->d:LO3/B;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/app/Application;

    .line 36
    .line 37
    const-class v1, Landroidx/lifecycle/a;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    sget-object v2, Landroidx/lifecycle/b0;->a:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {p1, v2}, Landroidx/lifecycle/b0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object v2, Landroidx/lifecycle/b0;->b:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {p1, v2}, Landroidx/lifecycle/b0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_0
    if-nez v2, :cond_1

    .line 61
    .line 62
    iget-object v0, p0, Landroidx/lifecycle/a0;->b:Landroidx/lifecycle/g0;

    .line 63
    .line 64
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/g0;->c(Ljava/lang/Class;LP1/e;)Landroidx/lifecycle/f0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :cond_1
    if-eqz v1, :cond_2

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-static {p2}, Landroidx/lifecycle/X;->b(LP1/c;)Landroidx/lifecycle/U;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p1, v2, p2}, Landroidx/lifecycle/b0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/f0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :cond_2
    invoke-static {p2}, Landroidx/lifecycle/X;->b(LP1/c;)Landroidx/lifecycle/U;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-static {p1, v2, p2}, Landroidx/lifecycle/b0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/f0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/a0;->d:Landroidx/lifecycle/q;

    .line 100
    .line 101
    if-eqz p2, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0, v1, p1}, Landroidx/lifecycle/a0;->d(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    .line 111
    .line 112
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 119
    .line 120
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/f0;
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/a0;->d:Landroidx/lifecycle/q;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    const-class v1, Landroidx/lifecycle/a;

    .line 6
    .line 7
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/lifecycle/a0;->a:Landroid/app/Application;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Landroidx/lifecycle/b0;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p2, v2}, Landroidx/lifecycle/b0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v2, Landroidx/lifecycle/b0;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {p2, v2}, Landroidx/lifecycle/b0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    if-nez v2, :cond_3

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/lifecycle/a0;->a:Landroid/app/Application;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Landroidx/lifecycle/a0;->b:Landroidx/lifecycle/g0;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroidx/lifecycle/g0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    sget-object p1, Landroidx/lifecycle/i0;->a:Landroidx/lifecycle/i0;

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    new-instance p1, Landroidx/lifecycle/i0;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    sput-object p1, Landroidx/lifecycle/i0;->a:Landroidx/lifecycle/i0;

    .line 53
    .line 54
    :cond_2
    sget-object p1, Landroidx/lifecycle/i0;->a:Landroidx/lifecycle/i0;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/I1;->Q(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_3
    iget-object v3, p0, Landroidx/lifecycle/a0;->e:LZ/m;

    .line 65
    .line 66
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, Landroidx/lifecycle/a0;->c:Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-virtual {v3, p1}, LZ/m;->h(Ljava/lang/String;)Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-nez v5, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move-object v4, v5

    .line 79
    :goto_1
    if-nez v4, :cond_5

    .line 80
    .line 81
    new-instance v4, Landroidx/lifecycle/U;

    .line 82
    .line 83
    invoke-direct {v4}, Landroidx/lifecycle/U;-><init>()V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    const-class v5, Landroidx/lifecycle/U;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Landroid/os/BaseBundle;->size()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    new-instance v6, Lo5/e;

    .line 104
    .line 105
    invoke-direct {v6, v5}, Lo5/e;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_6

    .line 121
    .line 122
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    check-cast v7, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v7}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-virtual {v6, v7, v8}, Lo5/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    invoke-virtual {v6}, Lo5/e;->b()Lo5/e;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    new-instance v5, Landroidx/lifecycle/U;

    .line 144
    .line 145
    invoke-direct {v5, v4}, Landroidx/lifecycle/U;-><init>(Lo5/e;)V

    .line 146
    .line 147
    .line 148
    move-object v4, v5

    .line 149
    :goto_3
    new-instance v5, Landroidx/lifecycle/V;

    .line 150
    .line 151
    invoke-direct {v5, p1, v4}, Landroidx/lifecycle/V;-><init>(Ljava/lang/String;Landroidx/lifecycle/U;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v3, v0}, Landroidx/lifecycle/V;->z(LZ/m;Landroidx/lifecycle/q;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b()Landroidx/lifecycle/p;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    sget-object v6, Landroidx/lifecycle/p;->r:Landroidx/lifecycle/p;

    .line 162
    .line 163
    if-eq p1, v6, :cond_8

    .line 164
    .line 165
    sget-object v6, Landroidx/lifecycle/p;->t:Landroidx/lifecycle/p;

    .line 166
    .line 167
    invoke-virtual {p1, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-ltz p1, :cond_7

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_7
    new-instance p1, Landroidx/lifecycle/h;

    .line 175
    .line 176
    invoke-direct {p1, v3, v0}, Landroidx/lifecycle/h;-><init>(LZ/m;Landroidx/lifecycle/q;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p1}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    :goto_4
    invoke-virtual {v3}, LZ/m;->F()V

    .line 184
    .line 185
    .line 186
    :goto_5
    if-eqz v1, :cond_9

    .line 187
    .line 188
    iget-object p1, p0, Landroidx/lifecycle/a0;->a:Landroid/app/Application;

    .line 189
    .line 190
    if-eqz p1, :cond_9

    .line 191
    .line 192
    filled-new-array {p1, v4}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-static {p2, v2, p1}, Landroidx/lifecycle/b0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/f0;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    goto :goto_6

    .line 201
    :cond_9
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {p2, v2, p1}, Landroidx/lifecycle/b0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/f0;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    :goto_6
    const-string p2, "androidx.lifecycle.savedstate.vm.tag"

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v0, p1, Landroidx/lifecycle/f0;->a:LR1/c;

    .line 215
    .line 216
    if-eqz v0, :cond_b

    .line 217
    .line 218
    iget-boolean v1, v0, LR1/c;->d:Z

    .line 219
    .line 220
    if-eqz v1, :cond_a

    .line 221
    .line 222
    invoke-static {v5}, LR1/c;->a(Ljava/lang/AutoCloseable;)V

    .line 223
    .line 224
    .line 225
    return-object p1

    .line 226
    :cond_a
    iget-object v1, v0, LR1/c;->a:LR1/b;

    .line 227
    .line 228
    monitor-enter v1

    .line 229
    :try_start_0
    iget-object v0, v0, LR1/c;->b:Ljava/util/LinkedHashMap;

    .line 230
    .line 231
    invoke-interface {v0, p2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    check-cast p2, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    .line 237
    monitor-exit v1

    .line 238
    invoke-static {p2}, LR1/c;->a(Ljava/lang/AutoCloseable;)V

    .line 239
    .line 240
    .line 241
    return-object p1

    .line 242
    :catchall_0
    move-exception p1

    .line 243
    monitor-exit v1

    .line 244
    throw p1

    .line 245
    :cond_b
    return-object p1

    .line 246
    :cond_c
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 247
    .line 248
    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 249
    .line 250
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw p1
.end method
