.class public final La6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX5/f;


# static fields
.field public static final b:La6/f;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:LZ5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La6/f;

    .line 2
    .line 3
    invoke-direct {v0}, La6/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La6/f;->b:La6/f;

    .line 7
    .line 8
    const-string v0, "kotlinx.serialization.json.JsonArray"

    .line 9
    .line 10
    sput-object v0, La6/f;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La6/n;->a:La6/n;

    .line 5
    .line 6
    new-instance v1, LZ5/b;

    .line 7
    .line 8
    invoke-interface {v0}, LV5/a;->b()LX5/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v2, "elementDesc"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0}, LZ5/F;-><init>(LX5/f;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, La6/f;->a:LZ5/b;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La6/f;->a:LZ5/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LZ5/F;->a(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, La6/f;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/measurement/I1;
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, LX5/i;->d:LX5/i;

    .line 7
    .line 8
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 7
    .line 8
    return-object v0
.end method

.method public final h(I)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ5/F;->h(I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    sget-object p1, Ln5/s;->q:Ln5/s;

    .line 7
    .line 8
    return-object p1
.end method

.method public final i(I)LX5/f;
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ5/F;->i(I)LX5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final isInline()Z
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final j(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, La6/f;->a:LZ5/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ5/F;->j(I)Z

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method
