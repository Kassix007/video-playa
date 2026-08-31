.class public abstract Landroidx/lifecycle/X;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO3/D;

.field public static final b:LO3/B;

.field public static final c:LO3/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LO3/D;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, LO3/D;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroidx/lifecycle/X;->a:LO3/D;

    .line 9
    .line 10
    new-instance v0, LO3/B;

    .line 11
    .line 12
    const/16 v1, 0xd

    .line 13
    .line 14
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Landroidx/lifecycle/X;->b:LO3/B;

    .line 18
    .line 19
    new-instance v0, LO3/D;

    .line 20
    .line 21
    invoke-direct {v0, v1}, LO3/D;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Landroidx/lifecycle/X;->c:LO3/D;

    .line 25
    .line 26
    return-void
.end method

.method public static final a(Landroidx/lifecycle/f0;LZ/m;Landroidx/lifecycle/q;)V
    .locals 2

    .line 1
    const-string v0, "registry"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lifecycle"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/lifecycle/f0;->a:LR1/c;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, LR1/c;->a:LR1/b;

    .line 18
    .line 19
    monitor-enter v1

    .line 20
    :try_start_0
    iget-object p0, p0, LR1/c;->b:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v1

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    monitor-exit v1

    .line 32
    throw p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    :goto_0
    check-cast p0, Landroidx/lifecycle/V;

    .line 35
    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    iget-boolean v0, p0, Landroidx/lifecycle/V;->s:Z

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/V;->z(LZ/m;Landroidx/lifecycle/q;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Landroidx/lifecycle/q;->b()Landroidx/lifecycle/p;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object v0, Landroidx/lifecycle/p;->r:Landroidx/lifecycle/p;

    .line 50
    .line 51
    if-eq p0, v0, :cond_2

    .line 52
    .line 53
    sget-object v0, Landroidx/lifecycle/p;->t:Landroidx/lifecycle/p;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-ltz p0, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    new-instance p0, Landroidx/lifecycle/h;

    .line 63
    .line 64
    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/h;-><init>(LZ/m;Landroidx/lifecycle/q;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    :goto_1
    invoke-virtual {p1}, LZ/m;->F()V

    .line 72
    .line 73
    .line 74
    :cond_3
    return-void
.end method

.method public static final b(LP1/c;)Landroidx/lifecycle/U;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/X;->a:LO3/D;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, LP1/c;->a(LP1/b;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lg2/e;

    .line 13
    .line 14
    if-eqz v0, :cond_c

    .line 15
    .line 16
    sget-object v1, Landroidx/lifecycle/X;->b:LO3/B;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, LP1/c;->a(LP1/b;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroidx/lifecycle/l0;

    .line 23
    .line 24
    if-eqz v1, :cond_b

    .line 25
    .line 26
    sget-object v2, Landroidx/lifecycle/X;->c:LO3/D;

    .line 27
    .line 28
    invoke-virtual {p0, v2}, LP1/c;->a(LP1/b;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Landroid/os/Bundle;

    .line 33
    .line 34
    sget-object v3, Landroidx/lifecycle/j0;->b:LO3/B;

    .line 35
    .line 36
    invoke-virtual {p0, v3}, LP1/c;->a(LP1/b;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz p0, :cond_a

    .line 43
    .line 44
    invoke-interface {v0}, Lg2/e;->b()LZ/m;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, LZ/m;->l()Lg2/d;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v3, v0, Landroidx/lifecycle/Y;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    check-cast v0, Landroidx/lifecycle/Y;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-object v0, v4

    .line 61
    :goto_0
    if-eqz v0, :cond_9

    .line 62
    .line 63
    invoke-static {v1}, Landroidx/lifecycle/X;->g(Landroidx/lifecycle/l0;)Landroidx/lifecycle/Z;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, Landroidx/lifecycle/Z;->b:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroidx/lifecycle/U;

    .line 74
    .line 75
    if-nez v3, :cond_8

    .line 76
    .line 77
    invoke-virtual {v0}, Landroidx/lifecycle/Y;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v3, v0, Landroidx/lifecycle/Y;->c:Landroid/os/Bundle;

    .line 81
    .line 82
    if-nez v3, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-nez v5, :cond_3

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    new-array v6, v5, [Lm5/j;

    .line 100
    .line 101
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, [Lm5/j;

    .line 106
    .line 107
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :cond_3
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    iput-object v4, v0, Landroidx/lifecycle/Y;->c:Landroid/os/Bundle;

    .line 121
    .line 122
    :cond_4
    move-object v4, v5

    .line 123
    :goto_1
    if-nez v4, :cond_5

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    move-object v2, v4

    .line 127
    :goto_2
    if-nez v2, :cond_6

    .line 128
    .line 129
    new-instance v0, Landroidx/lifecycle/U;

    .line 130
    .line 131
    invoke-direct {v0}, Landroidx/lifecycle/U;-><init>()V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    const-class v0, Landroidx/lifecycle/U;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    new-instance v3, Lo5/e;

    .line 152
    .line 153
    invoke-direct {v3, v0}, Lo5/e;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_7

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-virtual {v3, v4, v5}, Lo5/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    invoke-virtual {v3}, Lo5/e;->b()Lo5/e;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-instance v2, Landroidx/lifecycle/U;

    .line 192
    .line 193
    invoke-direct {v2, v0}, Landroidx/lifecycle/U;-><init>(Lo5/e;)V

    .line 194
    .line 195
    .line 196
    move-object v0, v2

    .line 197
    :goto_4
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    return-object v0

    .line 201
    :cond_8
    return-object v3

    .line 202
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 203
    .line 204
    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    .line 205
    .line 206
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p0

    .line 210
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 211
    .line 212
    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    .line 213
    .line 214
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p0

    .line 218
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 219
    .line 220
    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    .line 221
    .line 222
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p0

    .line 226
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 227
    .line 228
    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    .line 229
    .line 230
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw p0
.end method

.method public static final c(Lg2/e;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b()Landroidx/lifecycle/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/lifecycle/p;->r:Landroidx/lifecycle/p;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Landroidx/lifecycle/p;->s:Landroidx/lifecycle/p;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Failed requirement."

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p0}, Lg2/e;->b()LZ/m;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, LZ/m;->l()Lg2/d;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    new-instance v0, Landroidx/lifecycle/Y;

    .line 37
    .line 38
    invoke-interface {p0}, Lg2/e;->b()LZ/m;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v2, p0

    .line 43
    check-cast v2, Landroidx/lifecycle/l0;

    .line 44
    .line 45
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/Y;-><init>(LZ/m;Landroidx/lifecycle/l0;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Lg2/e;->b()LZ/m;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 53
    .line 54
    invoke-virtual {v1, v2, v0}, LZ/m;->C(Ljava/lang/String;Lg2/d;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v1, Landroidx/lifecycle/e;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    invoke-direct {v1, v2, v0}, Landroidx/lifecycle/e;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public static final d(Landroid/view/View;)Landroidx/lifecycle/x;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    const/4 v0, 0x0

    .line 7
    if-eqz p0, :cond_3

    .line 8
    .line 9
    const v1, 0x7f09020e

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v2, v1, Landroidx/lifecycle/x;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    check-cast v1, Landroidx/lifecycle/x;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move-object v1, v0

    .line 24
    :goto_1
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    invoke-static {p0}, Ll6/d;->q(Landroid/view/View;)Landroid/view/ViewParent;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    instance-of v1, p0, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    check-cast p0, Landroid/view/View;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object p0, v0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    return-object v0
.end method

.method public static final e(Landroid/view/View;)Landroidx/lifecycle/l0;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    const/4 v0, 0x0

    .line 7
    if-eqz p0, :cond_3

    .line 8
    .line 9
    const v1, 0x7f090211

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v2, v1, Landroidx/lifecycle/l0;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    check-cast v1, Landroidx/lifecycle/l0;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move-object v1, v0

    .line 24
    :goto_1
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    invoke-static {p0}, Ll6/d;->q(Landroid/view/View;)Landroid/view/ViewParent;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    instance-of v1, p0, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    check-cast p0, Landroid/view/View;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object p0, v0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    return-object v0
.end method

.method public static final f(Lcom/web2native/MainActivity;)Landroidx/lifecycle/s;
    .locals 5

    .line 1
    iget-object p0, p0, Lk1/e;->q:Landroidx/lifecycle/z;

    .line 2
    .line 3
    const-string v0, "<this>"

    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/lifecycle/q;->a:Landroidx/lifecycle/j0;

    .line 9
    .line 10
    :goto_0
    iget-object v1, v0, Landroidx/lifecycle/j0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroidx/lifecycle/s;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    new-instance v1, Landroidx/lifecycle/s;

    .line 24
    .line 25
    invoke-static {}, LM5/y;->c()LM5/q0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v3, LM5/H;->a:LT5/e;

    .line 30
    .line 31
    sget-object v3, LR5/n;->a:LN5/f;

    .line 32
    .line 33
    iget-object v3, v3, LN5/f;->t:LN5/f;

    .line 34
    .line 35
    invoke-static {v2, v3}, LE3/h;->L(Lq5/f;Lq5/h;)Lq5/h;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {v1, p0, v2}, Landroidx/lifecycle/s;-><init>(Landroidx/lifecycle/q;Lq5/h;)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v0, Landroidx/lifecycle/j0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 45
    .line 46
    :cond_1
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    sget-object p0, LM5/H;->a:LT5/e;

    .line 54
    .line 55
    sget-object p0, LR5/n;->a:LN5/f;

    .line 56
    .line 57
    iget-object p0, p0, LN5/f;->t:LN5/f;

    .line 58
    .line 59
    new-instance v0, Landroidx/lifecycle/r;

    .line 60
    .line 61
    invoke-direct {v0, v1, v3}, Landroidx/lifecycle/r;-><init>(Landroidx/lifecycle/s;Lq5/c;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x2

    .line 65
    invoke-static {v1, p0, v3, v0, v2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    goto :goto_0
.end method

.method public static final g(Landroidx/lifecycle/l0;)Landroidx/lifecycle/Z;
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/W;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-static {p0, v0, v1}, LO3/D;->p(Landroidx/lifecycle/l0;Landroidx/lifecycle/h0;I)Landroidx/lifecycle/j0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-class v0, Landroidx/lifecycle/Z;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object p0, p0, Landroidx/lifecycle/j0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, LE/c0;

    .line 20
    .line 21
    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, LE/c0;->v(Ljava/lang/String;Lkotlin/jvm/internal/f;)Landroidx/lifecycle/f0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroidx/lifecycle/Z;

    .line 28
    .line 29
    return-object p0
.end method

.method public static final h(Landroid/view/View;Landroidx/lifecycle/x;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7f09020e

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final i(Landroid/view/View;Landroidx/lifecycle/l0;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7f090211

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
