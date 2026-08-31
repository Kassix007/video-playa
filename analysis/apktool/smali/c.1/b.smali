.class public final Lc/b;
.super Lb/u;
.source "SourceFile"


# instance fields
.field public final synthetic d:LP/W;


# direct methods
.method public constructor <init>(LP/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b;->d:LP/W;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lb/u;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b;->d:LP/W;

    .line 2
    .line 3
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB5/a;

    .line 8
    .line 9
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
