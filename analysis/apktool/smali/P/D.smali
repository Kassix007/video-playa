.class public final LP/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/w0;


# instance fields
.field public final q:LB5/c;

.field public r:LP/E;


# direct methods
.method public constructor <init>(LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP/D;->q:LB5/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, LP/D;->q:LB5/c;

    .line 2
    .line 3
    sget-object v1, LP/b;->b:LP/F;

    .line 4
    .line 5
    invoke-interface {v0, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LP/E;

    .line 10
    .line 11
    iput-object v0, p0, LP/D;->r:LP/E;

    .line 12
    .line 13
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, LP/D;->r:LP/E;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LP/E;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, LP/D;->r:LP/E;

    .line 10
    .line 11
    return-void
.end method
