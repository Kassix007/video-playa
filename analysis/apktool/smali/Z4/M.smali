.class public final LZ4/M;
.super Landroidx/lifecycle/f0;
.source "SourceFile"


# instance fields
.field public final b:LP5/S;

.field public final c:LP5/D;

.field public final d:LP5/S;

.field public final e:LP5/S;

.field public final f:LP5/S;

.field public final g:LP5/D;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/f0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LZ4/M;->b:LP5/S;

    .line 10
    .line 11
    new-instance v1, LP5/D;

    .line 12
    .line 13
    invoke-direct {v1, v0}, LP5/D;-><init>(LP5/S;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, LZ4/M;->c:LP5/D;

    .line 17
    .line 18
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, p0, LZ4/M;->d:LP5/S;

    .line 25
    .line 26
    iput-object v1, p0, LZ4/M;->e:LP5/S;

    .line 27
    .line 28
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, LZ4/M;->f:LP5/S;

    .line 33
    .line 34
    new-instance v1, LP5/D;

    .line 35
    .line 36
    invoke-direct {v1, v0}, LP5/D;-><init>(LP5/S;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, LZ4/M;->g:LP5/D;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final c(Z)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LZ4/M;->d:LP5/S;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    iget-object v2, p0, LZ4/M;->d:LP5/S;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v1, v0}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, LZ4/M;->f:LP5/S;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v1, v0}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, LZ4/M;->b:LP5/S;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, p1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method
