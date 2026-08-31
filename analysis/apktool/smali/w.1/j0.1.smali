.class public final Lw/j0;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/E0;


# static fields
.field public static final F:Ls/b;


# instance fields
.field public E:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw/j0;->F:Ls/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final o()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lw/j0;->F:Ls/b;

    .line 2
    .line 3
    return-object v0
.end method
