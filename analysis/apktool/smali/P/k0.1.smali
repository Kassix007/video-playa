.class public final LP/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/W;
.implements LM5/w;


# instance fields
.field public final q:Lq5/h;

.field public final synthetic r:LP/W;


# direct methods
.method public constructor <init>(LP/W;Lq5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LP/k0;->q:Lq5/h;

    .line 5
    .line 6
    iput-object p1, p0, LP/k0;->r:LP/W;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LP/k0;->q:Lq5/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP/k0;->r:LP/W;

    .line 2
    .line 3
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP/k0;->r:LP/W;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
