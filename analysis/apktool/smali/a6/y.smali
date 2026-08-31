.class public final La6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX5/f;


# static fields
.field public static final b:La6/y;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:LZ5/D;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La6/y;

    .line 2
    .line 3
    invoke-direct {v0}, La6/y;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La6/y;->b:La6/y;

    .line 7
    .line 8
    const-string v0, "kotlinx.serialization.json.JsonObject"

    .line 9
    .line 10
    sput-object v0, La6/y;->c:Ljava/lang/String;

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
    sget-object v0, LZ5/a0;->a:LZ5/a0;

    .line 5
    .line 6
    sget-object v0, La6/n;->a:La6/n;

    .line 7
    .line 8
    sget-object v0, LZ5/a0;->a:LZ5/a0;

    .line 9
    .line 10
    sget-object v0, La6/n;->a:La6/n;

    .line 11
    .line 12
    new-instance v0, LZ5/D;

    .line 13
    .line 14
    sget-object v1, LZ5/a0;->b:LZ5/U;

    .line 15
    .line 16
    sget-object v2, La6/n;->b:LX5/g;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, LZ5/D;-><init>(LX5/f;LX5/f;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La6/y;->a:LZ5/D;

    .line 22
    .line 23
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
    iget-object v0, p0, La6/y;->a:LZ5/D;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LZ5/D;->a(Ljava/lang/String;)I

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
    sget-object v0, La6/y;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/measurement/I1;
    .locals 1

    .line 1
    iget-object v0, p0, La6/y;->a:LZ5/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, LX5/i;->e:LX5/i;

    .line 7
    .line 8
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object v0, p0, La6/y;->a:LZ5/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, La6/y;->a:LZ5/D;

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
    iget-object v0, p0, La6/y;->a:LZ5/D;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La6/y;->a:LZ5/D;

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
    iget-object v0, p0, La6/y;->a:LZ5/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ5/D;->h(I)Ljava/util/List;

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
    iget-object v0, p0, La6/y;->a:LZ5/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ5/D;->i(I)LX5/f;

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
    iget-object v0, p0, La6/y;->a:LZ5/D;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final j(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, La6/y;->a:LZ5/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ5/D;->j(I)Z

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method
