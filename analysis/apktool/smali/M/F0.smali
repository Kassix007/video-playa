.class public final LM/F0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LW0/c;

.field public final synthetic s:LM/J0;

.field public final synthetic t:LB5/c;

.field public final synthetic u:Z


# direct methods
.method public constructor <init>(ZLW0/c;LM/J0;LB5/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LM/F0;->q:Z

    .line 2
    .line 3
    iput-object p2, p0, LM/F0;->r:LW0/c;

    .line 4
    .line 5
    iput-object p3, p0, LM/F0;->s:LM/J0;

    .line 6
    .line 7
    iput-object p4, p0, LM/F0;->t:LB5/c;

    .line 8
    .line 9
    iput-boolean p5, p0, LM/F0;->u:Z

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, LM/I0;

    .line 2
    .line 3
    iget-object v4, p0, LM/F0;->t:LB5/c;

    .line 4
    .line 5
    iget-boolean v5, p0, LM/F0;->u:Z

    .line 6
    .line 7
    iget-boolean v1, p0, LM/F0;->q:Z

    .line 8
    .line 9
    iget-object v2, p0, LM/F0;->r:LW0/c;

    .line 10
    .line 11
    iget-object v3, p0, LM/F0;->s:LM/J0;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, LM/I0;-><init>(ZLW0/c;LM/J0;LB5/c;Z)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
