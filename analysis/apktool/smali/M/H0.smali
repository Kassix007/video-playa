.class public final LM/H0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LW0/c;

.field public final synthetic s:LB5/c;

.field public final synthetic t:Z


# direct methods
.method public constructor <init>(ZLW0/c;LB5/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LM/H0;->q:Z

    .line 2
    .line 3
    iput-object p2, p0, LM/H0;->r:LW0/c;

    .line 4
    .line 5
    iput-object p3, p0, LM/H0;->s:LB5/c;

    .line 6
    .line 7
    iput-boolean p4, p0, LM/H0;->t:Z

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, LM/J0;

    .line 3
    .line 4
    new-instance v0, LM/I0;

    .line 5
    .line 6
    iget-object v4, p0, LM/H0;->s:LB5/c;

    .line 7
    .line 8
    iget-boolean v5, p0, LM/H0;->t:Z

    .line 9
    .line 10
    iget-boolean v1, p0, LM/H0;->q:Z

    .line 11
    .line 12
    iget-object v2, p0, LM/H0;->r:LW0/c;

    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, LM/I0;-><init>(ZLW0/c;LM/J0;LB5/c;Z)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
