.class public final Lj0/x;
.super Lj0/B;
.source "SourceFile"


# instance fields
.field public final e:Lj0/A;


# direct methods
.method public constructor <init>(Lj0/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj0/x;->e:Lj0/A;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final l()Li0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/x;->e:Lj0/A;

    .line 2
    .line 3
    check-cast v0, Lj0/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lj0/g;->b()Li0/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
